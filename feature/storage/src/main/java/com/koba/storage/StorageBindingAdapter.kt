package com.koba.storage

import androidx.databinding.BindingAdapter
import androidx.recyclerview.widget.RecyclerView

@BindingAdapter("bindStorageList")
fun RecyclerView.bindStorageList(state: StorageUiState?) {
    state ?: return

    if (state is StorageUiState.HaveList) {
        (adapter as? StorageListAdapter)?.submitList(state.storageImageList)
    }
}
