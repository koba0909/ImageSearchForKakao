package com.koba.domain.usecase

import android.util.Log
import com.koba.base.di.DispatcherModule
import com.koba.data.repository.SearchRepository
import com.koba.domain.model.SearchResult
import com.koba.domain.toSearchResultImageList
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.catch
import kotlinx.coroutines.flow.flowOn
import kotlinx.coroutines.flow.map
import javax.inject.Inject

class GetImageSearchResultListUseCase @Inject constructor(
    private val searchRepository: SearchRepository,
    @DispatcherModule.DispatcherDefault
    private val defaultDispatcher: CoroutineDispatcher,
) {

    suspend operator fun invoke(keyword: String): Flow<List<SearchResult>> =
        searchRepository.requestSearchFromImage(keyword)
            .map {
                it.imageInfo.toSearchResultImageList()
            }
            .catch { e ->
                e.message?.let { Log.e(TAG, it) }
                emit(emptyList())
            }
            .flowOn(defaultDispatcher)

    companion object {
        const val TAG = "GetImageSearchResultListUseCase"
    }
}
