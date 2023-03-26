package com.koba.search

import android.os.Bundle
import android.view.View
import androidx.appcompat.widget.SearchView
import androidx.fragment.app.viewModels
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.lifecycleScope
import androidx.lifecycle.repeatOnLifecycle
import com.google.android.material.snackbar.Snackbar
import com.koba.base.BaseDataBindingFragment
import com.koba.search.databinding.FragmentSearchBinding
import com.koba.storage.StorageFragment
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class SearchFragment : BaseDataBindingFragment<FragmentSearchBinding>(R.layout.fragment_search) {
    private val searchViewModel: SearchViewModel by viewModels()
    private val searchListAdapter by lazy {
        SearchListAdapter(
            onPickImage = {
                searchViewModel.onPickImage(it)
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
            viewModel = searchViewModel
            recyclerviewSearchResult.adapter = searchListAdapter

            searchView.setOnQueryTextListener(object : SearchView.OnQueryTextListener {
                override fun onQueryTextSubmit(query: String): Boolean {
                    return false
                }

                override fun onQueryTextChange(newText: String): Boolean {
                    searchViewModel.onSearchKeyword(newText)
                    return false
                }
            })
        }
    }

    private fun collectFlows() {
        viewLifecycleOwner.lifecycleScope.launch {
            viewLifecycleOwner.repeatOnLifecycle(Lifecycle.State.STARTED) {
                searchViewModel.run {
                    launch {
                        uiState.collect {
                            binding.uiState = it
                        }
                    }

                    launch {
                        storageClickEvent.collect {
                            childFragmentManager.beginTransaction()
                                .replace(R.id.frame_layout_storage, StorageFragment.newInstance())
                                .commit()
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

    companion object {
        fun newInstance() = SearchFragment()
    }
}
