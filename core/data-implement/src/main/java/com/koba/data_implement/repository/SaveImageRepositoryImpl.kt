package com.koba.data_implement.repository

import com.koba.data.dto.SavedImageDto
import com.koba.data.repository.SaveImageRepository
import com.koba.data_implement.provider.ImageSharedPreferenceProvider
import javax.inject.Inject

class SaveImageRepositoryImpl @Inject constructor(
    private val imageSharedPreferenceProvider: ImageSharedPreferenceProvider,
) : SaveImageRepository {
    override fun saveImage(thumbnailUrl: String, saveTime: Long) {
        imageSharedPreferenceProvider.setLong(thumbnailUrl, saveTime)
    }

    override fun deleteImage(thumbnailUrl: String) {
        imageSharedPreferenceProvider.remove(thumbnailUrl)
    }

    override fun contain(thumbnailUrl: String) = imageSharedPreferenceProvider.contain(thumbnailUrl)

    override fun getSavedImageList(): List<SavedImageDto> =
        imageSharedPreferenceProvider.getAll()
            .filter { it.value is Long }
            .map {
                SavedImageDto(it.key, it.value as Long)
            }
}
