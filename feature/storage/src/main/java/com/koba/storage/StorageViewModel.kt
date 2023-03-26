package com.koba.storage

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.koba.domain.model.SavedImage
import com.koba.domain.usecase.DeleteImageUrlUseCase
import com.koba.domain.usecase.GetSavedImageListUseCase
import com.koba.domain.usecase.SaveImageUrlUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import javax.inject.Inject

sealed interface StorageUiState {
    object Empty : StorageUiState

    data class HaveList(val savedImageList: List<SavedImage>) : StorageUiState
}

@HiltViewModel
class StorageViewModel @Inject constructor(
    private val getSavedImageListUseCase: GetSavedImageListUseCase,
    private val saveImageUrlUseCase: SaveImageUrlUseCase,
    private val deleteImageUrlUseCase: DeleteImageUrlUseCase,
) : ViewModel() {
    private val _savedImageList = MutableStateFlow<List<SavedImage>>(emptyList())

    val uiState = _savedImageList.map {
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
            }.onSuccess {
                _savedImageList.update { list ->
                    list.sortedBy { it.savedTime }
                }
            }.onFailure { e ->
                e.message?.let { Log.e(TAG, it) }
            }
        }
    }

    fun saveImage(thumbnailUrl: String) {
        viewModelScope.launch {
            saveImageUrlUseCase(
                thumbnailUrl,
                System.nanoTime(),
            )

            fetchSavedImages()
        }
    }

    fun deleteImage(thumbnailUrl: String) {
        viewModelScope.launch {
            deleteImageUrlUseCase(thumbnailUrl)
            fetchSavedImages()
        }
    }

    companion object {
        const val TAG = "StorageViewModel"
    }
}
