package com.koba.search

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.koba.domain.model.SearchResult
import com.koba.domain.usecase.GetImageSearchResultListUseCase
import com.koba.domain.usecase.GetVideoSearchResultListUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import javax.inject.Inject

sealed interface SearchUIState {
    object Empty : SearchUIState
    object Loading : SearchUIState
    data class Show(
        val imageList: List<SearchResult>,
    ) : SearchUIState
}

@HiltViewModel
class SearchViewModel @Inject constructor(
    private val getImageSearchResultListUseCase: GetImageSearchResultListUseCase,
    private val getVideoSearchResultListUseCase: GetVideoSearchResultListUseCase,
) : ViewModel() {
    private val _isLoading = MutableStateFlow(false)
    private val _imageList = MutableStateFlow<List<SearchResult>>(emptyList())

    val uiState = combine(_isLoading, _imageList) { isLoading, imageList ->
        when {
            isLoading -> SearchUIState.Loading
            imageList.isEmpty() -> SearchUIState.Empty
            else -> SearchUIState.Show(imageList)
        }
    }

    fun onSearchKeyword(keyword: String): Boolean {
        _imageList.update {
            emptyList()
        }

        viewModelScope.launch {
            combine(
                getImageSearchResultListUseCase(keyword),
                getVideoSearchResultListUseCase(keyword),
            ) { images, videos ->
                images + videos
            }.map { searchResults ->
                searchResults.sortedBy { it.dateTime }
            }.onStart {
                _isLoading.update { true }
            }.onCompletion {
                _isLoading.update { false }
            }.catch { e ->
                Log.d("hugh", e.message ?: "")
            }.collect {
                _imageList.update { it }
            }
        }
        return false
    }

    fun onPickImage(searchResult: SearchResult) {
        // TODO image 선택 후 보관함에 저장
    }
}
