package com.koba.search;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00172\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0017B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u000f\u001a\u00020\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0010H\u0002J\u001a\u0010\u0012\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\r\u00a8\u0006\u0018"}, d2 = {"Lcom/koba/search/SearchFragment;", "Lcom/koba/base/BaseDataBindingFragment;", "Lcom/koba/search/databinding/FragmentSearchBinding;", "()V", "searchListAdapter", "Lcom/koba/search/SearchListAdapter;", "getSearchListAdapter", "()Lcom/koba/search/SearchListAdapter;", "searchListAdapter$delegate", "Lkotlin/Lazy;", "searchViewModel", "Lcom/koba/search/SearchViewModel;", "getSearchViewModel", "()Lcom/koba/search/SearchViewModel;", "searchViewModel$delegate", "collectFlows", "", "initView", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "Companion", "search_debug"})
@dagger.hilt.android.AndroidEntryPoint()
public final class SearchFragment extends com.koba.base.BaseDataBindingFragment<com.koba.search.databinding.FragmentSearchBinding> {
    private final kotlin.Lazy searchViewModel$delegate = null;
    private final kotlin.Lazy searchListAdapter$delegate = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.koba.search.SearchFragment.Companion Companion = null;
    
    public SearchFragment() {
        super(0);
    }
    
    private final com.koba.search.SearchViewModel getSearchViewModel() {
        return null;
    }
    
    private final com.koba.search.SearchListAdapter getSearchListAdapter() {
        return null;
    }
    
    @java.lang.Override()
    public void onViewCreated(@org.jetbrains.annotations.NotNull()
    android.view.View view, @org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    private final void initView() {
    }
    
    private final void collectFlows() {
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/koba/search/SearchFragment$Companion;", "", "()V", "newInstance", "Lcom/koba/search/SearchFragment;", "search_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final com.koba.search.SearchFragment newInstance() {
            return null;
        }
    }
}