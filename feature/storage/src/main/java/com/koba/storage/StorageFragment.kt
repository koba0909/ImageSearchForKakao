package com.koba.storage

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.koba.base.BaseDataBindingFragment
import com.koba.storage.databinding.FragmentStorageBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class StorageFragment : BaseDataBindingFragment<FragmentStorageBinding>(R.layout.fragment_storage) {
    val storageViewModel: StorageViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
    }
}
