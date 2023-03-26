package com.koba.search

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView

@BindingAdapter("bindIsSaved")
internal fun ImageView.bindIsSaved(isSaved: Boolean?) {
    isSaved ?: return
    setImageResource(
        if (isSaved) {
            R.drawable.storage_on
        } else {
            R.drawable.storage_off
        },
    )
}

@BindingAdapter("bindSearchList")
internal fun RecyclerView.bindSearchList(state: SearchUIState?) {
    if (state is SearchUIState.HaveList) {
        (adapter as? SearchListAdapter)?.submitList(state.imageList)
    }
}
