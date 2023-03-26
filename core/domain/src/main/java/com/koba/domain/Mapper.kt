package com.koba.domain

import com.koba.data.dto.ImageInfoDto
import com.koba.data.dto.SavedImageDto
import com.koba.data.dto.VideoInfoDto
import com.koba.domain.model.StorageImage
import com.koba.domain.model.SearchResult

fun List<ImageInfoDto>.toSearchResultImageList(): List<SearchResult> {
    return map {
        SearchResult.Image(
            thumbnailUrl = it.thumbnailUrl,
            dateTime = it.datetime,
            isSaved = false,
        )
    }
}

fun List<VideoInfoDto>.toSearchResultVideoList(): List<SearchResult> {
    return map {
        SearchResult.Video(
            thumbnailUrl = it.thumbnailUrl,
            dateTime = it.datetime,
            isSaved = false,
        )
    }
}

fun SavedImageDto.toSavedImage() = StorageImage(thumbnailUrl, savedTime)
