package com.koba.storage

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.koba.domain.model.SavedImage
import com.koba.storage.viewholder.StorageImageViewHolder

class StorageListAdapter(
    private val onPickImage: (SavedImage) -> Unit,
) : ListAdapter<SavedImage, RecyclerView.ViewHolder>(diffCallback) {

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
        private val diffCallback = object : DiffUtil.ItemCallback<SavedImage>() {
            override fun areItemsTheSame(
                oldItem: SavedImage,
                newItem: SavedImage,
            ) = oldItem.thumbnailUrl == newItem.thumbnailUrl

            override fun areContentsTheSame(
                oldItem: SavedImage,
                newItem: SavedImage,
            ) = oldItem == newItem
        }
    }
}
