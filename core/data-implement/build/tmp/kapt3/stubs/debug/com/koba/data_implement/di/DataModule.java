package com.koba.data_implement.di;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\'\u0018\u0000 \u00072\u00020\u0001:\u0001\u0007B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\'\u00a8\u0006\b"}, d2 = {"Lcom/koba/data_implement/di/DataModule;", "", "()V", "bindSearchRepository", "Lcom/koba/data/repository/SearchRepository;", "repositoryImpl", "Lcom/koba/data_implement/repository/SearchRepositoryImpl;", "Companion", "data-implement_debug"})
@dagger.Module()
public abstract class DataModule {
    @org.jetbrains.annotations.NotNull()
    public static final com.koba.data_implement.di.DataModule.Companion Companion = null;
    
    public DataModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    @javax.inject.Singleton()
    @dagger.Binds()
    public abstract com.koba.data.repository.SearchRepository bindSearchRepository(@org.jetbrains.annotations.NotNull()
    com.koba.data_implement.repository.SearchRepositoryImpl repositoryImpl);
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007\u00a8\u0006\u0007"}, d2 = {"Lcom/koba/data_implement/di/DataModule$Companion;", "", "()V", "provideRetrofitService", "Lcom/koba/data/service/RetrofitService;", "retrofitNetwork", "Lcom/koba/network/RetrofitNetwork;", "data-implement_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        @javax.inject.Singleton()
        @dagger.Provides()
        public final com.koba.data.service.RetrofitService provideRetrofitService(@org.jetbrains.annotations.NotNull()
        com.koba.network.RetrofitNetwork retrofitNetwork) {
            return null;
        }
    }
}