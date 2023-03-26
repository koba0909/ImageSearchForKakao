package com.koba.domain.usecase

import com.koba.data.repository.StorageRepository
import javax.inject.Inject

class DeleteImageUrlUseCase @Inject constructor(
	private val savedRepository: StorageRepository,
) {
    suspend operator fun invoke(url: String) {
        savedRepository.deleteImage(url)
    }
}
