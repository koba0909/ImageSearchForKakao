package com.koba.data_implement.repository

import com.koba.data.repository.SearchRepository
import com.koba.data.service.RetrofitService
import kotlinx.coroutines.flow.flow
import javax.inject.Inject

class SearchRepositoryImpl @Inject constructor(
    private val retrofitService: RetrofitService,
) : SearchRepository {
    override suspend fun requestSearchFromImage(keyword: String) = flow {
        emit(retrofitService.requestSearchImage(keyword))
    }

    override suspend fun requestSearchFromVideo(keyword: String) = flow {
        emit(retrofitService.requestSearchVideo(keyword))
    }
}
