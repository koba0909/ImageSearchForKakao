package com.koba.storage

import androidx.lifecycle.ViewModel
import com.koba.domain.model.SavedImage
import com.koba.domain.usecase.DeleteImageUrlUseCase
import com.koba.domain.usecase.GetSavedImageListUseCase
import com.koba.domain.usecase.SaveImageUrlUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
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
}
