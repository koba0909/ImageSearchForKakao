package com.koba.data.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class ImageSearchResponseDto(
    @SerialName("meta")
    val pagingInfo: PaingingInfoDto,
    @SerialName("documents")
    val imageInfo: List<ImageInfoDto>,
)

@Serializable
data class ImageInfoDto(
    @SerialName("thumbnail_url")
    val thumbnailUrl: String,
    val datetime: String,
)
