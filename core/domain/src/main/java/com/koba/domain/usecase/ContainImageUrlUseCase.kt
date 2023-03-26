package com.koba.domain.usecase

import com.koba.data.repository.SaveImageRepository
import javax.inject.Inject

class ContainImageUrlUseCase @Inject constructor(
    private val repository: SaveImageRepository,
) {
    suspend operator fun invoke(url: String) = repository.contain(url)
}
