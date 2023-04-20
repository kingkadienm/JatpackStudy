package com.wangzs.jatpackstudy.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

/**
 * @author: wangzs
 * @date: 2022-11-17 22:14
 * @description:
 */
class TestFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    companion object {
        fun getInstance(bundle: Bundle?): TestFragment {
            val testFragment = TestFragment()
            testFragment.arguments = bundle
            return testFragment
        }
    }
}