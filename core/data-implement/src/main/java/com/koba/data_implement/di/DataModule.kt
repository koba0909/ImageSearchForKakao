package com.koba.data_implement.di

import com.koba.data.repository.SearchRepository
import com.koba.data.service.RetrofitService
import com.koba.data_implement.repository.SearchRepositoryImpl
import com.koba.network.RetrofitNetwork
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class DataModule {

    @Binds
    @Singleton
    abstract fun bindSearchRepository(repositoryImpl: SearchRepositoryImpl): SearchRepository

    companion object {
        @Provides
        @Singleton
        fun provideRetrofitService(
            retrofitNetwork: RetrofitNetwork,
        ): RetrofitService =
            retrofitNetwork.getDefaultBuilder(
                RetrofitService.BASE_URL,
            )
                .build()
                .create(RetrofitService::class.java)
    }
}
