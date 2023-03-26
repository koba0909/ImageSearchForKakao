package com.koba.storage

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.koba.domain.model.StorageImage
import com.koba.domain.usecase.DeleteImageUrlUseCase
import com.koba.domain.usecase.GetSavedImageListUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import javax.inject.Inject

sealed interface StorageUiState {
    object Empty : StorageUiState

    data class HaveList(val storageImageList: List<StorageImage>) : StorageUiState
}

@HiltViewModel
class StorageViewModel @Inject constructor(
    private val getSavedImageListUseCase: GetSavedImageListUseCase,
    private val deleteImageUrlUseCase: DeleteImageUrlUseCase,
) : ViewModel() {
    private val _storageImageList = MutableStateFlow<List<StorageImage>>(emptyList())

    private val _showSnackBar = MutableSharedFlow<Int>()
    val showSnackBar get() = _showSnackBar

    val uiState = _storageImageList.map {
        if (it.isEmpty()) {
            StorageUiState.Empty
        } else {
            StorageUiState.HaveList(it)
        }
    }.stateIn(
        scope = viewModelScope,
        started = SharingStarted.WhileSubscribed(5_000),
        initialValue = StorageUiState.Empty,
    )

    init {
        fetchSavedImages()
    }

    private fun fetchSavedImages() {
        viewModelScope.launch {
            runCatching {
                getSavedImageListUseCase()
            }.onSuccess { list ->
                _storageImageList.update { _ ->
                    list.sortedBy { it.savedTime }
                }
            }.onFailure { e ->
                e.message?.let { Log.e(TAG, it) }
            }
        }
    }

    fun deleteImage(thumbnailUrl: String) {
        viewModelScope.launch {
            _showSnackBar.emit(R.string.delete_storage)

            deleteImageUrlUseCase(thumbnailUrl)

            fetchSavedImages()
        }
    }

    companion object {
        const val TAG = "StorageViewModel"
    }
}
