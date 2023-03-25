package com.koba.search

import android.util.Log
import androidx.lifecycle.ViewModel
import com.koba.domain.model.ImageModel
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.combine
import javax.inject.Inject

sealed interface SearchUIState {
    object Empty : SearchUIState
    object Loading : SearchUIState
    data class Show(
        val imageList: List<ImageModel>,
    ) : SearchUIState
}

@HiltViewModel
class SearchViewModel @Inject constructor() : ViewModel() {
    private val _isLoading = MutableStateFlow(false)
    private val _imageList = MutableStateFlow<List<ImageModel>>(emptyList())

    val uiState = combine(_isLoading, _imageList) { isLoading, imageList ->
        when {
            isLoading -> SearchUIState.Loading
            imageList.isEmpty() -> SearchUIState.Empty
            else -> SearchUIState.Show(imageList)
        }
    }

    fun onSearchKeyword(keyword: String): Boolean {
        Log.d("hugh", keyword)
        return false
    }
}
