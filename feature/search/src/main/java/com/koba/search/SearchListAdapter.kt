package com.koba.search

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.koba.domain.model.SearchResult
import com.koba.search.viewholder.SearchResultViewHolder

class SearchListAdapter(
    private val onPickImage: (SearchResult) -> Unit,
) : ListAdapter<SearchResult, RecyclerView.ViewHolder>(diffCallback) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        return SearchResultViewHolder(
            binding = DataBindingUtil.inflate(
                LayoutInflater.from(parent.context),
                R.layout.holder_search_result,
                parent,
                false,
            ),
            onPickImage = onPickImage,
        )
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        when (holder) {
            is SearchResultViewHolder -> holder.bind(getItem(position))
        }
    }

    override fun onBindViewHolder(
        holder: RecyclerView.ViewHolder,
        position: Int,
        payloads: MutableList<Any>,
    ) {
        if (payloads.isEmpty()) {
            onBindViewHolder(holder, position)
        } else {
            payloads.forEach {
                if (it == PAYLOAD_STORAGE) {
                    when (holder) {
                        is SearchResultViewHolder -> holder.bindIsSaved(getItem(position))
                    }
                }
            }
        }
    }

    companion object {
        private const val PAYLOAD_STORAGE = 0

        private val diffCallback = object : DiffUtil.ItemCallback<SearchResult>() {
            override fun areItemsTheSame(
                oldItem: SearchResult,
                newItem: SearchResult,
            ) = oldItem.thumbnailUrl == newItem.thumbnailUrl

            override fun areContentsTheSame(
                oldItem: SearchResult,
                newItem: SearchResult,
            ) = oldItem == newItem

            override fun getChangePayload(oldItem: SearchResult, newItem: SearchResult): Any? {
                return if (oldItem.isSaved != newItem.isSaved) {
                    PAYLOAD_STORAGE
                } else {
                    super.getChangePayload(oldItem, newItem)
                }
            }
        }
    }
}
