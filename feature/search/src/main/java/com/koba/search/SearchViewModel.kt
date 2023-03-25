package com.koba.search

import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class SearchViewModel @Inject constructor() : ViewModel() {
    fun onSearchKeyword(keyword: String): Boolean {
        Log.d("hugh", keyword)
        return false
    }
}
