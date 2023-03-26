package com.koba.data_implement.repository

import com.koba.base.di.DispatcherModule
import com.koba.data.dto.SavedImageDto
import com.koba.data.repository.SaveImageRepository
import com.koba.data_implement.provider.ImageSharedPreferenceProvider
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext
import javax.inject.Inject

class SaveImageRepositoryImpl @Inject constructor(
    private val imageSharedPreferenceProvider: ImageSharedPreferenceProvider,
    @DispatcherModule.DispatcherIO
    private val ioDispatcher: CoroutineDispatcher,
) : SaveImageRepository {
    override suspend fun saveImage(thumbnailUrl: String, saveTime: Long) {
        withContext(ioDispatcher) {
            imageSharedPreferenceProvider.setLong(thumbnailUrl, saveTime)
        }
    }

    override suspend fun deleteImage(thumbnailUrl: String) {
        withContext(ioDispatcher) {
            imageSharedPreferenceProvider.remove(thumbnailUrl)
        }
    }

    override suspend fun contain(thumbnailUrl: String) = withContext(ioDispatcher) {
        imageSharedPreferenceProvider.contain(thumbnailUrl)
    }

    override suspend fun getSavedImageList(): List<SavedImageDto> =
        withContext(ioDispatcher) {
            imageSharedPreferenceProvider.getAll()
                .filter { it.value is Long }
                .map {
                    SavedImageDto(it.key, it.value as Long)
                }
        }
}
