package com.koba.data.repository

import com.koba.data.dto.SearchResponseDto
import kotlinx.coroutines.flow.Flow

interface SearchRepository {
    suspend fun requestSearch(keyword: String): Flow<SearchResponseDto>
}
