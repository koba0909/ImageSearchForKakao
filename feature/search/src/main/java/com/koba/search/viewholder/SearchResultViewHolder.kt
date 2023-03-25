package com.koba.search.viewholder

import androidx.recyclerview.widget.RecyclerView
import com.koba.domain.model.ImageModel
import com.koba.search.databinding.HolderSearchResultBinding

class SearchResultViewHolder(
    private val binding: HolderSearchResultBinding,
    private val onPickImage: (ImageModel) -> Unit,
) : RecyclerView.ViewHolder(binding.root) {
    init {
        binding.imageViewThumbnail.setOnLongClickListener {
            onPickImage.invoke(binding.imageModel)
            true
        }
    }

    fun bind(imageModel: ImageModel) {
        binding.imageModel = imageModel
        binding.executePendingBindings()
    }
}
