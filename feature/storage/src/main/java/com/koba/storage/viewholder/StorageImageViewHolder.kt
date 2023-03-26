package com.koba.storage.viewholder

import androidx.recyclerview.widget.RecyclerView
import com.koba.domain.model.SavedImage
import com.koba.storage.databinding.HolderStorageImageBinding

class StorageImageViewHolder(
    private val binding: HolderStorageImageBinding,
    private val onPickImage: (SavedImage) -> Unit,
) : RecyclerView.ViewHolder(binding.root) {
    init {
        binding.imageViewThumbnail.setOnLongClickListener {
            binding.imageModel?.let {
                onPickImage.invoke(it)
            }
            true
        }
    }

    fun bind(savedImage: SavedImage) {
        binding.imageModel = savedImage
        binding.executePendingBindings()
    }
}