package com.koba.storage

import androidx.fragment.app.viewModels
import com.koba.base.BaseDataBindingFragment
import com.koba.storage.databinding.FragmentStorageBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class StorageFragment : BaseDataBindingFragment<FragmentStorageBinding>(R.layout.fragment_storage) {
	val storageViewModel: StorageViewModel by viewModels()
}
