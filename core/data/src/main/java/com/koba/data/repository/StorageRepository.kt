package com.koba.data.repository

import com.koba.data.dto.SavedImageDto

interface StorageRepository {
    suspend fun saveImage(
        thumbnailUrl: String,
        saveTime: Long,
    )

    suspend fun deleteImage(thumbnailUrl: String)

    suspend fun contain(thumbnailUrl: String): Boolean

    suspend fun getSavedImageList(): List<SavedImageDto>
}
