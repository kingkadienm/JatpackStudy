package com.wangzs.jatpackstudy.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.wangzs.jatpackstudy.adapter.OneRecycleAdapter
import com.wangzs.jatpackstudy.databinding.FragmentOneBinding
import com.wangzs.jatpackstudy.viewmodel.OneViewModel


class OneFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {

        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val inflate = FragmentOneBinding.inflate(layoutInflater)
        val oneViewModel = ViewModelProvider(this)[OneViewModel::class.java]
        inflate.oneViewModel = oneViewModel

        inflate.oneRecycle.layoutManager = LinearLayoutManager(context)

        val strList = arrayListOf("1","2")

        val oneRecycleAdapter = OneRecycleAdapter(strList)
        inflate.oneRecycle.adapter = oneRecycleAdapter
        return inflate.root
    }


    companion object {

        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            OneFragment().apply {
                arguments = Bundle().apply {

                }
            }
    }
}