package com.koba.data_implement.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/koba/data_implement/repository/SearchRepositoryImpl;", "Lcom/koba/data/repository/SearchRepository;", "retrofitService", "Lcom/koba/data/service/RetrofitService;", "(Lcom/koba/data/service/RetrofitService;)V", "requestSearchFromImage", "Lkotlinx/coroutines/flow/Flow;", "Lcom/koba/data/dto/SearchResponseDto;", "keyword", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "requestSearchFromVideo", "data-implement_debug"})
public final class SearchRepositoryImpl implements com.koba.data.repository.SearchRepository {
    private final com.koba.data.service.RetrofitService retrofitService = null;
    
    @javax.inject.Inject()
    public SearchRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.koba.data.service.RetrofitService retrofitService) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object requestSearchFromImage(@org.jetbrains.annotations.NotNull()
    java.lang.String keyword, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<com.koba.data.dto.SearchResponseDto>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object requestSearchFromVideo(@org.jetbrains.annotations.NotNull()
    java.lang.String keyword, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlinx.coroutines.flow.Flow<com.koba.data.dto.SearchResponseDto>> continuation) {
        return null;
    }
}