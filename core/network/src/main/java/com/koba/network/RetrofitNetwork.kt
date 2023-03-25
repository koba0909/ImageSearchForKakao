package com.koba.network

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import java.util.concurrent.TimeUnit
import javax.inject.Inject

class RetrofitNetwork @Inject constructor(
    private val json: Json,
) {

    @OptIn(ExperimentalSerializationApi::class)
    fun getDefaultBuilder(
        baseUrl: String,
        connectTime: Long = 10L,
        readTime: Long = 10L,
        writeTime: Long = 10L,
    ): Retrofit.Builder = Retrofit.Builder()
        .baseUrl(baseUrl)
        .client(
            OkHttpClient.Builder()
                .connectTimeout(connectTime, TimeUnit.SECONDS)
                .readTimeout(readTime, TimeUnit.SECONDS)
                .writeTimeout(writeTime, TimeUnit.SECONDS)
                .build(),
        )
        .addConverterFactory(
            json.asConverterFactory("application/json".toMediaType()),
        )
}
