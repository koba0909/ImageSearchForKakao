package com.koba.data.service

import com.koba.data.dto.ImageSearchResponseDto
import com.koba.data.dto.VideoSearchResponseDto
import retrofit2.http.GET
import retrofit2.http.Headers
import retrofit2.http.Query

interface RetrofitService {

    @Headers("Authorization: KakaoAK 26b95b38dfc8ad5778a46b34db535b5f")
    @GET("/v2/search/image")
    suspend fun requestSearchImage(
        @Query("query")
        query: String,
    ): ImageSearchResponseDto

    @Headers("Authorization: KakaoAK 26b95b38dfc8ad5778a46b34db535b5f")
    @GET("/v2/search/video")
    suspend fun requestSearchVideo(
        @Query("query")
        query: String,
    ): VideoSearchResponseDto

    companion object {
        const val BASE_URL = "http://dapi.kakao.com"
    }
}
