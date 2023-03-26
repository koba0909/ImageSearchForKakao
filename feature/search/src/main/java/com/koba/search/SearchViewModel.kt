package com.koba.search

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.koba.domain.model.SearchResult
import com.koba.domain.usecase.DeleteImageUrlUseCase
import com.koba.domain.usecase.GetImageSearchResultListUseCase
import com.koba.domain.usecase.GetVideoSearchResultListUseCase
import com.koba.domain.usecase.SaveImageUrlUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.FlowPreview
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import javax.inject.Inject

sealed interface SearchUIState {
    object Empty : SearchUIState
    object Loading : SearchUIState
    data class HaveList(
        val imageList: List<SearchResult>,
    ) : SearchUIState
}

@OptIn(ExperimentalCoroutinesApi::class, FlowPreview::class)
@HiltViewModel
class SearchViewModel @Inject constructor(
    private val getImageSearchResultListUseCase: GetImageSearchResultListUseCase,
    private val getVideoSearchResultListUseCase: GetVideoSearchResultListUseCase,
    private val saveImageUrlUseCase: SaveImageUrlUseCase,
    private val deleteImageUrlUseCase: DeleteImageUrlUseCase,
) : ViewModel() {

    private val _showSnackBar = MutableSharedFlow<Int>()
    val showSnackBar get() = _showSnackBar

    private val _isLoading = MutableStateFlow(false)

    private val _keyword = MutableSharedFlow<String>()

    private val _searchResult = MutableStateFlow<List<SearchResult>>(emptyList())

    val uiState = combine(_isLoading, _searchResult) { isLoading, searchResult ->
        when {
            isLoading -> SearchUIState.Loading
            searchResult.isEmpty() -> SearchUIState.Empty
            else -> {
                SearchUIState.HaveList(searchResult)
            }
        }
    }.stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(5_000),
        initialValue = SearchUIState.Empty,
    )

    private val _storageClickEvent = MutableSharedFlow<Unit>()
    val storageClickEvent get() = _storageClickEvent

    init {
        viewModelScope.launch {
            _keyword.onEach { _isLoading.update { true } }
                .debounce(500)
                .flatMapLatest { getSearchResultFlow(it) }
                .collect {
                    _isLoading.update { false }
                    _searchResult.emit(it)
                }
        }
    }

    fun onSearchKeyword(keyword: String): Boolean {
        viewModelScope.launch {
            _keyword.emit(keyword)
        }
        return false
    }

    private suspend fun getSearchResultFlow(keyword: String): Flow<List<SearchResult>> {
        if (keyword.isBlank()) {
            return flowOf(emptyList())
        }

        return combine(
            getImageSearchResultListUseCase(keyword),
            getVideoSearchResultListUseCase(keyword),
        ) { images, videos ->
            images + videos
        }.map { searchResults ->
            searchResults.sortedBy { it.dateTime }
        }.catch { e ->
            e.message?.let { Log.e(TAG, it) }
        }
    }

    fun onPickImage(searchResult: SearchResult) {
        if (searchResult.isSaved) {
            deleteImage(searchResult)
        } else {
            saveImage(searchResult)
        }

        val selectPosition = _searchResult.value.indexOf(searchResult)

        if (selectPosition == -1) return

        _searchResult.update {
            it.toMutableList().apply {
                this[selectPosition] = searchResult.copy(isSaved = !searchResult.isSaved)
            }
        }
    }

    private fun saveImage(searchResult: SearchResult) {
        viewModelScope.launch {
            _showSnackBar.emit(R.string.save_to_storage)

            saveImageUrlUseCase(
                searchResult.thumbnailUrl,
                System.nanoTime(),
            )
        }
    }

    private fun deleteImage(searchResult: SearchResult) {
        viewModelScope.launch {
            _showSnackBar.emit(R.string.delete_to_storage)

            deleteImageUrlUseCase(searchResult.thumbnailUrl)
        }
    }

    fun onClickStorageButton() {
        viewModelScope.launch {
            _storageClickEvent.emit(Unit)
        }
    }

    companion object {
        private const val TAG = "SearchViewModel"
    }
}
