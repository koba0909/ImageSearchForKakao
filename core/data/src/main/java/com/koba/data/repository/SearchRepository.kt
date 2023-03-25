package com.koba.data.repository

import com.koba.data.dto.SearchResponseDto
import kotlinx.coroutines.flow.Flow

interface SearchRepository {
    suspend fun requestSearchFromImage(keyword: String): Flow<SearchResponseDto>
    suspend fun requestSearchFromVideo(keyword: String): Flow<SearchResponseDto>
}
