package com.koba.search;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\nJ\u000e\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0017R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011\u00a8\u0006\u0018"}, d2 = {"Lcom/koba/search/SearchViewModel;", "Landroidx/lifecycle/ViewModel;", "getImageSearchResultListUseCase", "Lcom/koba/domain/usecase/GetImageSearchResultListUseCase;", "getVideoSearchResultListUseCase", "Lcom/koba/domain/usecase/GetVideoSearchResultListUseCase;", "(Lcom/koba/domain/usecase/GetImageSearchResultListUseCase;Lcom/koba/domain/usecase/GetVideoSearchResultListUseCase;)V", "_imageList", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Lcom/koba/domain/model/SearchResult;", "_isLoading", "", "uiState", "Lkotlinx/coroutines/flow/Flow;", "Lcom/koba/search/SearchUIState;", "getUiState", "()Lkotlinx/coroutines/flow/Flow;", "onPickImage", "", "searchResult", "onSearchKeyword", "keyword", "", "search_debug"})
public final class SearchViewModel extends androidx.lifecycle.ViewModel {
    private final com.koba.domain.usecase.GetImageSearchResultListUseCase getImageSearchResultListUseCase = null;
    private final com.koba.domain.usecase.GetVideoSearchResultListUseCase getVideoSearchResultListUseCase = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _isLoading = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.util.List<com.koba.domain.model.SearchResult>> _imageList = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.Flow<com.koba.search.SearchUIState> uiState = null;
    
    @javax.inject.Inject()
    public SearchViewModel(@org.jetbrains.annotations.NotNull()
    com.koba.domain.usecase.GetImageSearchResultListUseCase getImageSearchResultListUseCase, @org.jetbrains.annotations.NotNull()
    com.koba.domain.usecase.GetVideoSearchResultListUseCase getVideoSearchResultListUseCase) {
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
    com.koba.domain.model.SearchResult searchResult) {
    }
}