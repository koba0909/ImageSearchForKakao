package com.koba.domain.usecase

import com.koba.data.repository.StorageRepository
import javax.inject.Inject

class ContainImageUrlUseCase @Inject constructor(
	private val repository: StorageRepository,
) {
    suspend operator fun invoke(url: String) = repository.contain(url)
}
