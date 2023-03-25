package com.koba.domain

import com.koba.data.dto.ImageInfoDto
import com.koba.data.dto.VideoInfoDto
import com.koba.domain.model.SearchResult

fun List<ImageInfoDto>.toSearchResultList(): List<SearchResult> {
    return map {
        SearchResult.Image(
            thumbnailUrl = it.thumbnailUrl,
            dateTime = it.datetime,
            isSaved = false,
        )
    }
}

fun List<VideoInfoDto>.toSearchResultList(): List<SearchResult> {
    return map {
        SearchResult.Video(
            thumbnailUrl = it.thumbnailUrl,
            dateTime = it.datetime,
            isSaved = false,
        )
    }
}
