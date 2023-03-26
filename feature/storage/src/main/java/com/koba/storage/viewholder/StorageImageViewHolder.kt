package com.koba.storage.viewholder

import androidx.recyclerview.widget.RecyclerView
import com.koba.domain.model.StorageImage
import com.koba.storage.databinding.HolderStorageImageBinding

class StorageImageViewHolder(
    private val binding: HolderStorageImageBinding,
    private val onPickImage: (StorageImage) -> Unit,
) : RecyclerView.ViewHolder(binding.root) {
    init {
        binding.imageViewThumbnail.setOnLongClickListener {
            binding.imageModel?.let {
                onPickImage.invoke(it)
            }
            true
        }
    }

    fun bind(storageImage: StorageImage) {
        binding.imageModel = storageImage
        binding.executePendingBindings()
    }
}