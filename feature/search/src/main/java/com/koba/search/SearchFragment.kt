package com.koba.search

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.koba.base.BaseDataBindingFragment
import com.koba.search.databinding.FragmentSearchBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class SearchFragment : BaseDataBindingFragment<FragmentSearchBinding>(R.layout.fragment_search) {
    private val viewModel: SearchViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initView()
    }

    private fun initView() {
        binding.viewModel = viewModel
    }

    companion object {
        fun newInstance() = SearchFragment()
    }
}
