package com.koba.domain.usecase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J%\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b2\u0006\u0010\u000b\u001a\u00020\fH\u0086B\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/koba/domain/usecase/GetImageSearchResultListUseCase;", "", "searchRepository", "Lcom/koba/data/repository/SearchRepository;", "defaultDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lcom/koba/data/repository/SearchRepository;Lkotlinx/coroutines/CoroutineDispatcher;)V", "invoke", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/koba/domain/model/SearchResult;", "keyword", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "domain_debug"})
public final class GetImageSearchResultListUseCase {
    private final com.koba.data.repository.SearchRepository searchRepository = null;
    private final kotlinx.coroutines.CoroutineDispatcher defaultDispatcher = null;
    @org.jetbrains.annotations.NotNull()
    public static final com.koba.domain.usecase.GetImageSearchResultListUseCase.Companion Companion = null;
    @org.jetbrains.annotations.NotNull()
    public static final java.lang.String TAG = "GetImageSearchResultListUseCase";
    
    @javax.inject.Inject()
    public GetImageSearchResultListUseCase(@org.jetbrains.annotations.NotNull()
    com.koba.data.repository.SearchRepository searchRepository, @org.jetbrains.annotations.NotNull()
    @com.koba.base.di.DispatcherModule.DispatcherDefault()
    kotlinx.coroutines.CoroutineDispatcher defaultDispatcher) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object invoke(@org.jetbrains.annotations.NotNull()
    java.lang.String keyword, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<? extends java.util.List<? extends com.koba.domain.model.SearchResult>>> continuation) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/koba/domain/usecase/GetImageSearchResultListUseCase$Companion;", "", "()V", "TAG", "", "domain_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}