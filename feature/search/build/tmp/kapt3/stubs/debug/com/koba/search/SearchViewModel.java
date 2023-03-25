package com.koba.search;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0006J\u000e\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0012\u001a\u00020\u0013R\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\b0\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0014"}, d2 = {"Lcom/koba/search/SearchViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "_imageList", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/koba/domain/model/ImageModel;", "_isLoading", "", "uiState", "Lkotlinx/coroutines/flow/Flow;", "Lcom/koba/search/SearchUIState;", "getUiState", "()Lkotlinx/coroutines/flow/Flow;", "onPickImage", "", "imageModel", "onSearchKeyword", "keyword", "", "search_debug"})
public final class SearchViewModel extends androidx.lifecycle.ViewModel {
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _isLoading = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.koba.domain.model.ImageModel>> _imageList = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<com.koba.search.SearchUIState> uiState = null;
    
    @javax.inject.Inject()
    public SearchViewModel() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.Flow<com.koba.search.SearchUIState> getUiState() {
        return null;
    }
    
    public final boolean onSearchKeyword(@org.jetbrains.annotations.NotNull()
    java.lang.String keyword) {
        return false;
    }
    
    public final void onPickImage(@org.jetbrains.annotations.NotNull()
    com.koba.domain.model.ImageModel imageModel) {
    }
}