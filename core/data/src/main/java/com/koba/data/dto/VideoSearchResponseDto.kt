package com.koba.data.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class VideoSearchResponseDto(
    @SerialName("meta")
    val pagingInfo: PaingingInfoDto,
    @SerialName("documents")
    val videoInfo: List<VideoInfoDto>,
)

@Serializable
data class VideoInfoDto(
    @SerialName("thumbnail_url")
    val thumbnailUrl: String,
    val datetime: String,
)
