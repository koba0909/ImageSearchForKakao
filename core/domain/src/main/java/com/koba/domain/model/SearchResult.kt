package com.koba.domain.model

sealed interface SearchResult {
    val thumbnailUrl: String
    val dateTime: String
    val isSaved: Boolean

    data class Image(
        override val thumbnailUrl: String,
        override val dateTime: String,
        override val isSaved: Boolean,
    ) : SearchResult

    data class Video(
        override val thumbnailUrl: String,
        override val dateTime: String,
        override val isSaved: Boolean,
    ) : SearchResult
}
