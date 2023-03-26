package com.koba.domain

import com.koba.data.dto.ImageInfoDto
import com.koba.data.dto.SavedImageDto
import com.koba.data.dto.VideoInfoDto
import com.koba.domain.model.SearchResult
import com.koba.domain.model.StorageImage

internal inline fun ImageInfoDto.toSearchResultImage(
    isStorage: () -> Boolean
): SearchResult {
    return SearchResult(
        thumbnailUrl = thumbnailUrl,
        dateTime = datetime,
        isSaved = isStorage.invoke(),
    )
}

internal inline fun VideoInfoDto.toSearchResultVideoList(
    isStorage: () -> Boolean
): SearchResult {
    return SearchResult(
        thumbnailUrl = thumbnailUrl,
        dateTime = datetime,
        isSaved = isStorage.invoke(),
    )
}

internal fun SavedImageDto.toSavedImage() = StorageImage(thumbnailUrl, savedTime)
