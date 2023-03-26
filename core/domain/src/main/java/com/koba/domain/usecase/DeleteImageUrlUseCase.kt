package com.koba.domain.usecase

import com.koba.data.repository.SaveImageRepository
import javax.inject.Inject

class DeleteImageUrlUseCase @Inject constructor(
    private val savedRepository: SaveImageRepository,
) {
    suspend operator fun invoke(url: String) {
        savedRepository.deleteImage(url)
    }
}
