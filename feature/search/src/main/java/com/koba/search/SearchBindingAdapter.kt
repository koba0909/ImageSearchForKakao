package com.koba.search

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView

@BindingAdapter("bindIsSaved")
internal fun ImageView.bindIsSaved(isSaved: Boolean?) {
    isSaved ?: return
// 	setImageResource(
// 		if (isSaved) {
// 			// 이미 보관함에 추가되었을 경우 이미지
// 		} else {
//
// 		}
// 	)
}

@BindingAdapter("bindSearchList")
internal fun RecyclerView.bindSearchList(state: SearchUIState?) {
    if (state is SearchUIState.Show) {
        (adapter as? SearchListAdapter)?.submitList(state.imageList)
    }
}
