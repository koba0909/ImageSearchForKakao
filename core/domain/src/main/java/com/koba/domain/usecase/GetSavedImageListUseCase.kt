package com.koba.domain.usecase

import com.koba.base.di.DispatcherModule
import com.koba.data.repository.StorageRepository
import com.koba.domain.model.StorageImage
import com.koba.domain.toSavedImage
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext
import javax.inject.Inject

class GetSavedImageListUseCase @Inject constructor(
    private val storageRepository: StorageRepository,
    @DispatcherModule.DispatcherDefault
    private val defaultDispatcher: CoroutineDispatcher,
) {
    suspend operator fun invoke(): List<StorageImage> {
        return storageRepository.getSavedImageList()
            .map {
                withContext(defaultDispatcher) {
                    it.toSavedImage()
                }
            }
    }
}
