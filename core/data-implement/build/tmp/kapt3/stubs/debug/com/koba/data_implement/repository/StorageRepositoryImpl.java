package com.koba.data_implement.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0019\u0010\f\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\nH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0011J!\u0010\u0012\u001a\u00020\r2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0014H\u0096@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0016"}, d2 = {"Lcom/koba/data_implement/repository/StorageRepositoryImpl;", "Lcom/koba/data/repository/StorageRepository;", "imageSharedPreferenceProvider", "Lcom/koba/data_implement/provider/ImageSharedPreferenceProvider;", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "(Lcom/koba/data_implement/provider/ImageSharedPreferenceProvider;Lkotlinx/coroutines/CoroutineDispatcher;)V", "contain", "", "thumbnailUrl", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteImage", "", "getSavedImageList", "", "Lcom/koba/data/dto/SavedImageDto;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveImage", "saveTime", "", "(Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "data-implement_debug"})
public final class StorageRepositoryImpl implements com.koba.data.repository.StorageRepository {
    private final com.koba.data_implement.provider.ImageSharedPreferenceProvider imageSharedPreferenceProvider = null;
    private final kotlinx.coroutines.CoroutineDispatcher ioDispatcher = null;
    
    @javax.inject.Inject()
    public StorageRepositoryImpl(@org.jetbrains.annotations.NotNull()
    com.koba.data_implement.provider.ImageSharedPreferenceProvider imageSharedPreferenceProvider, @org.jetbrains.annotations.NotNull()
    @com.koba.base.di.DispatcherModule.DispatcherIO()
    kotlinx.coroutines.CoroutineDispatcher ioDispatcher) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object saveImage(@org.jetbrains.annotations.NotNull()
    java.lang.String thumbnailUrl, long saveTime, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object deleteImage(@org.jetbrains.annotations.NotNull()
    java.lang.String thumbnailUrl, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object contain(@org.jetbrains.annotations.NotNull()
    java.lang.String thumbnailUrl, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.lang.Boolean> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public java.lang.Object getSavedImageList(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super java.util.List<com.koba.data.dto.SavedImageDto>> continuation) {
        return null;
    }
}