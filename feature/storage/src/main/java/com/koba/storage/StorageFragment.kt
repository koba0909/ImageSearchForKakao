package com.koba.storage

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import com.koba.base.BaseDataBindingFragment
import com.koba.storage.databinding.FragmentStorageBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

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
        collectFlows()
    }

    private fun initView() {
        with(binding) {
            viewModel = storageViewModel
            recyclerViewStorage.adapter = storageListAdapter
        }
    }

    private fun collectFlows() {
        viewLifecycleOwner.lifecycleScope.launch {
            viewLifecycleOwner.repeatOnLifecycle(Lifecycle.State.STARTED) {
                storageViewModel.run {
                    uiState.collect {
                        binding.uiState = it
                    }
                }
            }
        }
    }

    companion object {
        fun newInstance() = StorageFragment()
    }
}
