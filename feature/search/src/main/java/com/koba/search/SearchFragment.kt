package com.koba.search

import com.koba.base.BaseDataBindingFragment
import com.koba.search.databinding.FragmentSearchBinding

class SearchFragment : BaseDataBindingFragment<FragmentSearchBinding>(R.layout.fragment_search) {
    companion object {
        fun newInstance() = SearchFragment()
    }
}
