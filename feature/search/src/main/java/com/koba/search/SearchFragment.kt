package com.koba.search

import androidx.fragment.app.viewModels
import com.koba.base.BaseDataBindingFragment
import com.koba.search.databinding.FragmentSearchBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SearchFragment : BaseDataBindingFragment<FragmentSearchBinding>(R.layout.fragment_search) {
    private val viewModel: SearchViewModel by viewModels()

    companion object {
        fun newInstance() = SearchFragment()
    }
}
