package com.koba.storage

import android.content.Context
import android.os.Bundle
import android.view.View
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import com.google.android.material.snackbar.Snackbar
import com.koba.base.BaseDataBindingFragment
import com.koba.storage.databinding.FragmentStorageBinding
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class StorageFragment : BaseDataBindingFragment<FragmentStorageBinding>(R.layout.fragment_storage) {

    private val storageViewModel: StorageViewModel by viewModels()

    private val backPressedCallback = object : OnBackPressedCallback(true) {
        override fun handleOnBackPressed() {
            requireParentFragment().childFragmentManager.beginTransaction()
                .remove(this@StorageFragment)
                .commit()
        }
    }

    private val storageListAdapter: StorageListAdapter by lazy {
        StorageListAdapter(
            onPickImage = {
                storageViewModel.deleteImage(it.thumbnailUrl)
            },
        )
    }

    override fun onAttach(context: Context) {
        super.onAttach(context)
        requireActivity().onBackPressedDispatcher.addCallback(backPressedCallback)
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
                    launch {
                        uiState.collect {
                            binding.uiState = it
                        }
                    }

                    launch {
                        showSnackBar.collect {
                            Snackbar.make(
                                binding.root,
                                it,
                                Snackbar.LENGTH_SHORT,
                            ).show()
                        }
                    }
                }
            }
        }
    }

    override fun onDetach() {
        super.onDetach()
        backPressedCallback.remove()
    }

    companion object {
        fun newInstance() = StorageFragment()
    }
}
