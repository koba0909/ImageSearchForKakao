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
                onPickImage.invoke(it)
            }
            true
        }
    }

    fun bind(searchResult: SearchResult) {
        binding.imageModel = searchResult
        binding.executePendingBindings()
    }
}
