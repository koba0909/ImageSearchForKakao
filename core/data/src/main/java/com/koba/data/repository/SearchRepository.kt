package com.koba.data.repository

import com.koba.data.dto.ImageSearchResponseDto
import com.koba.data.dto.VideoSearchResponseDto
import kotlinx.coroutines.flow.Flow

interface SearchRepository {
    suspend fun requestSearchFromImage(keyword: String): Flow<ImageSearchResponseDto>
    suspend fun requestSearchFromVideo(keyword: String): Flow<VideoSearchResponseDto>
}
