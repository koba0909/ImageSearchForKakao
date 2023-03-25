package com.koba.data.repository

import com.koba.data.dto.SavedImageDto

interface SaveImageRepository {
    fun saveImage(
        thumbnailUrl: String,
        saveTime: Long,
    )

    fun contain(
        thumbnailUrl: String,
    ): Boolean

    fun getSavedImageList(): List<SavedImageDto>
}
