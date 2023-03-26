package com.koba.domain.usecase

import com.koba.data.repository.StorageRepository
import javax.inject.Inject

class SaveImageUrlUseCase @Inject constructor(
	private val storageRepository: StorageRepository,
) {
    suspend operator fun invoke(thumbnailUrl: String, saveTime: Long) {
        storageRepository.saveImage(thumbnailUrl, saveTime)
    }
}
