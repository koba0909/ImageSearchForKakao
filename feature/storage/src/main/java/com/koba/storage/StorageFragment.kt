package com.koba.storage

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.koba.base.BaseDataBindingFragment
import com.koba.storage.databinding.FragmentStorageBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class StorageFragment : BaseDataBindingFragment<FragmentStorageBinding>(R.layout.fragment_storage) {

    private val storageViewModel: StorageViewModel by viewModels()

    private val storageListAdapter: StorageListAdapter by lazy {
        StorageListAdapter(
            onPickImage = {
                storageViewModel.deleteImage(it.thumbnailUrl)
            },
        )
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView() {
        with(binding) {
			recyclerViewStorage.adapter = storageListAdapter
        }
    }
}
