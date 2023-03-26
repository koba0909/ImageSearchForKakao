package com.koba.search.viewholder

import androidx.recyclerview.widget.RecyclerView
import com.koba.domain.model.SearchResult
import com.koba.search.databinding.HolderSearchResultBinding

class SearchResultViewHolder(
    private val binding: HolderSearchResultBinding,
    private val onPickImage: (SearchResult) -> Unit,
) : RecyclerView.ViewHolder(binding.root) {
    init {
        binding.imageViewThumbnail.setOnLongClickListener {
            binding.imageModel?.let {
                onPickImage.invoke(
                    it.copy(
                        isSaved = binding.isSaved ?: false
                    )
                )
            }
            true
        }
    }

    fun bind(searchResult: SearchResult) {
        with(binding) {
            binding.imageModel = searchResult
            binding.isSaved = searchResult.isSaved
            executePendingBindings()
        }
    }

    fun bindIsSaved(searchResult: SearchResult) {
        with(binding) {
            binding.isSaved = searchResult.isSaved
            binding.executePendingBindings()
        }
    }
}
