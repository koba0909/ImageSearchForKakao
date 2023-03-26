package com.koba.domain.usecase

import com.koba.base.di.DispatcherModule
import com.koba.data.repository.SaveImageRepository
import com.koba.domain.model.SavedImage
import com.koba.domain.toSavedImage
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext
import javax.inject.Inject

class GetSavedImageListUseCase @Inject constructor(
    private val saveImageRepository: SaveImageRepository,
    @DispatcherModule.DispatcherDefault
    private val defaultDispatcher: CoroutineDispatcher,
) {
    suspend operator fun invoke(): List<SavedImage> {
        return saveImageRepository.getSavedImageList()
            .map {
                withContext(defaultDispatcher) {
                    it.toSavedImage()
                }
            }
    }
}
