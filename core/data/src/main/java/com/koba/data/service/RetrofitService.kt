package com.koba.data.service

import com.koba.data.dto.SearchResponseDto
import retrofit2.http.GET
import retrofit2.http.Query

interface RetrofitService {
    @GET("/v2/search/image")
    fun requestSearchImage(
        @Query("query")
        query: String,
    ): SearchResponseDto

    @GET("/v2/search/video")
    fun requestSearchVideo(
        @Query("query")
        query: String,
    ): SearchResponseDto

    companion object {
        const val BASE_URL = "https://dapi.kakao.com"
    }
}
