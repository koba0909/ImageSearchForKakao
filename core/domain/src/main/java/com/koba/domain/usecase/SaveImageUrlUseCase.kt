package com.koba.domain.usecase

import com.koba.data.repository.SaveImageRepository
import javax.inject.Inject

class SaveImageUrlUseCase @Inject constructor(
    private val saveImageRepository: SaveImageRepository,
) {
    suspend operator fun invoke(thumbnailUrl: String, saveTime: Long) {
        saveImageRepository.saveImage(thumbnailUrl, saveTime)
    }
}
