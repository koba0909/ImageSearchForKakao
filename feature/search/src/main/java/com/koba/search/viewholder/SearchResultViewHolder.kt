package com.koba.search.viewholder

import androidx.recyclerview.widget.RecyclerView
import com.koba.domain.model.ImageModel
import com.koba.search.databinding.HolderSearchResultBinding

class SearchResultViewHolder(
	private val binding: HolderSearchResultBinding
) : RecyclerView.ViewHolder(binding.root) {

	fun bind(imageModel: ImageModel) {
		binding.imageModel = imageModel
		binding.executePendingBindings()
	}
}