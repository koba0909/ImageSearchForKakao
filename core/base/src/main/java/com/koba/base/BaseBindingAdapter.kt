package com.koba.base

import android.view.View
import android.widget.ImageView
import androidx.core.view.isVisible
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

@BindingAdapter("isVisible")
fun View.isVisible(isVisible: Boolean) {
    this.isVisible = isVisible
}

@BindingAdapter("bindImageUrl")
fun ImageView.bindImageUrl(url: String) {
    Glide.with(context)
        .load(url)
        .into(this)
}
