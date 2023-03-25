package com.koba.data.service

import com.koba.data.dto.ImageSearchResponseDto
import com.koba.data.dto.VideoSearchResponseDto
import retrofit2.http.GET
import retrofit2.http.Query

interface RetrofitService {
    @GET("/v2/search/image")
    suspend fun requestSearchImage(
        @Query("query")
        query: String,
    ): ImageSearchResponseDto

    @GET("/v2/search/video")
    suspend fun requestSearchVideo(
        @Query("query")
        query: String,
    ): VideoSearchResponseDto

    companion object {
        const val BASE_URL = "https://dapi.kakao.com"
    }
}
