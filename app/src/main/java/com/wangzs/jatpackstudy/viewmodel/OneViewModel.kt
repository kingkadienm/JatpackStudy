package com.wangzs.jatpackstudy.viewmodel

import android.util.Log
import android.view.View
import androidx.navigation.findNavController
import androidx.navigation.fragment.NavHostFragment.Companion.findNavController
import androidx.navigation.fragment.findNavController
import com.wangzs.jatpackstudy.R

class OneViewModel : BaseViewModel() {


    fun goPage(v: View) {
        Log.e(TAG, "goPage: " )
        v.findNavController().navigate(R.id.action_oneFragment_to_twoFragment)
    }

}