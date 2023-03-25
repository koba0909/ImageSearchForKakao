package com.koba.data_implement.repository

import com.koba.data.dto.SearchResponseDto
import com.koba.data.repository.SearchRepository
import kotlinx.coroutines.flow.Flow

class SearchRepositoryImpl : SearchRepository {
    override suspend fun requestSearch(keyword: String): Flow<SearchResponseDto> {
        TODO("Not yet implemented")
    }
}
