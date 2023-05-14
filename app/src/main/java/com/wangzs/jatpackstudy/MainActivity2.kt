package com.wangzs.jatpackstudy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.wangzs.jatpackstudy.api.ApiService
import com.wangzs.jatpackstudy.bean.TestResponse
import com.wangzs.jatpackstudy.bean.User
import com.wangzs.jatpackstudy.bean.UserBean
import com.wangzs.jatpackstudy.databinding.ActivityMainBinding
import com.wangzs.jatpackstudy.repository.MyRepository
import com.wangzs.jatpackstudy.viewmodel.UserViewModel

class MainActivity2 : BaseVmActivity<ActivityMainBinding, UserViewModel>() {
    val TAG = this.javaClass.name

    override fun initData() {
        super.initData()
        mViewModel.datas.observe(this) {
            Log.e(TAG, "onCreate: ${it.toString()}")
            mBinding?.viewModel = mViewModel
        }
        mViewModel.dataChange()
    }

    override fun viewModelClass(): Class<UserViewModel> {
        return UserViewModel::class.java
    }

    override fun getViewBinding(): ActivityMainBinding? {
        return ActivityMainBinding.inflate(layoutInflater)
    }
}