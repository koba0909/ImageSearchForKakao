package com.koba.storage

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.koba.domain.model.StorageImage
import com.koba.storage.viewholder.StorageImageViewHolder

class StorageListAdapter(
	private val onPickImage: (StorageImage) -> Unit,
) : ListAdapter<StorageImage, RecyclerView.ViewHolder>(diffCallback) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return StorageImageViewHolder(
            binding = DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                R.layout.holder_storage_image,
                parent,
                false,
            ),
            onPickImage = onPickImage,
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is StorageImageViewHolder -> holder.bind(getItem(position))
        }
    }

    companion object {
        private val diffCallback = object : DiffUtil.ItemCallback<StorageImage>() {
            override fun areItemsTheSame(
	            oldItem: StorageImage,
	            newItem: StorageImage,
            ) = oldItem.thumbnailUrl == newItem.thumbnailUrl

            override fun areContentsTheSame(
	            oldItem: StorageImage,
	            newItem: StorageImage,
            ) = oldItem == newItem
        }
    }
}
