package com.koba.data.dto

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class SearchResponseDto(
    @SerialName("meta")
    val pagingInfo: PaingInfoDto,
    @SerialName("documents")
    val imageInfo: List<ImageInfoDto>,
)

@Serializable
data class PaingInfoDto(
    @SerialName("total_count")
    val totalCount: Int,
    @SerialName("pageable_count")
    val pageableCount: Int,
    @SerialName("is_end")
    val isEnd: Boolean,
)

@Serializable
data class ImageInfoDto(
    @SerialName("thumbnail_url")
    val thumbnailUrl: String,
    val datetime: String,
)
