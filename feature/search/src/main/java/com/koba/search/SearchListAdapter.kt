package com.koba.search

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.koba.domain.model.ImageModel
import com.koba.search.viewholder.SearchResultViewHolder

class SearchListAdapter(
    private val onPickImage: (ImageModel) -> Unit
) : ListAdapter<ImageModel, RecyclerView.ViewHolder>(diffCallback) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return SearchResultViewHolder(
            binding = DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                R.layout.holder_search_result,
                parent,
                false,
            ),
            onPickImage = onPickImage
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is SearchResultViewHolder -> holder.bind(getItem(position))
        }
    }

    companion object {
        private val diffCallback = object : DiffUtil.ItemCallback<ImageModel>() {
            override fun areItemsTheSame(
                oldItem: ImageModel,
                newItem: ImageModel,
            ) = oldItem.url == newItem.url

            override fun areContentsTheSame(
                oldItem: ImageModel,
                newItem: ImageModel,
            ) = oldItem == newItem
        }
    }
}
