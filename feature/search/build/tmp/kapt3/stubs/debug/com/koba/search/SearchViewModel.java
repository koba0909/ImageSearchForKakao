package com.koba.search;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel()
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007\b\u0007\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/koba/search/SearchViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "onSearchKeyword", "", "keyword", "", "search_debug"})
public final class SearchViewModel extends androidx.lifecycle.ViewModel {
    
    @javax.inject.Inject()
    public SearchViewModel() {
        super();
    }
    
    public final boolean onSearchKeyword(@org.jetbrains.annotations.NotNull()
    java.lang.String keyword) {
        return false;
    }
}