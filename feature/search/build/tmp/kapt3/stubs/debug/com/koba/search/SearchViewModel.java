package com.koba.search;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J%\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000e2\u0006\u0010\u0019\u001a\u00020\fH\u0082@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u001aJ\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0010J\u000e\u0010\u001e\u001a\u00020\t2\u0006\u0010\u0019\u001a\u00020\fR\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\b\u0012\u0004\u0012\u00020\f0\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f0\u000eX\u0082\u0004\u00a2\u0006\b\n\u0000\u0012\u0004\b\u0011\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u001f"}, d2 = {"Lcom/koba/search/SearchViewModel;", "Landroidx/lifecycle/ViewModel;", "getImageSearchResultListUseCase", "Lcom/koba/domain/usecase/GetImageSearchResultListUseCase;", "getVideoSearchResultListUseCase", "Lcom/koba/domain/usecase/GetVideoSearchResultListUseCase;", "(Lcom/koba/domain/usecase/GetImageSearchResultListUseCase;Lcom/koba/domain/usecase/GetVideoSearchResultListUseCase;)V", "_isLoading", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "_keyword", "Lkotlinx/coroutines/flow/MutableSharedFlow;", "", "_searchResult", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/koba/domain/model/SearchResult;", "get_searchResult$annotations", "()V", "uiState", "Lkotlinx/coroutines/flow/StateFlow;", "Lcom/koba/search/SearchUIState;", "getUiState", "()Lkotlinx/coroutines/flow/StateFlow;", "getSearchResultFlow", "keyword", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "onPickImage", "", "searchResult", "onSearchKeyword", "search_debug"})
public final class SearchViewModel extends androidx.lifecycle.ViewModel {
    private final com.koba.domain.usecase.GetImageSearchResultListUseCase getImageSearchResultListUseCase = null;
    private final com.koba.domain.usecase.GetVideoSearchResultListUseCase getVideoSearchResultListUseCase = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.Boolean> _isLoading = null;
    private final kotlinx.coroutines.flow.MutableSharedFlow<java.lang.String> _keyword = null;
    private final kotlinx.coroutines.flow.Flow<java.util.List<com.koba.domain.model.SearchResult>> _searchResult = null;
    @org.jetbrains.annotations.NotNull()
    private final kotlinx.coroutines.flow.StateFlow<com.koba.search.SearchUIState> uiState = null;
    
    @javax.inject.Inject()
    public SearchViewModel(@org.jetbrains.annotations.NotNull()
    com.koba.domain.usecase.GetImageSearchResultListUseCase getImageSearchResultListUseCase, @org.jetbrains.annotations.NotNull()
    com.koba.domain.usecase.GetVideoSearchResultListUseCase getVideoSearchResultListUseCase) {
        super();
    }
    
    @kotlin.OptIn(markerClass = {kotlinx.coroutines.FlowPreview.class, kotlinx.coroutines.ExperimentalCoroutinesApi.class})
    @java.lang.Deprecated()
    private static void get_searchResult$annotations() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.flow.StateFlow<com.koba.search.SearchUIState> getUiState() {
        return null;
    }
    
    public final boolean onSearchKeyword(@org.jetbrains.annotations.NotNull()
    java.lang.String keyword) {
        return false;
    }
    
    private final java.lang.Object getSearchResultFlow(java.lang.String keyword, kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends java.util.List<? extends com.koba.domain.model.SearchResult>>> continuation) {
        return null;
    }
    
    public final void onPickImage(@org.jetbrains.annotations.NotNull()
    com.koba.domain.model.SearchResult searchResult) {
    }
}