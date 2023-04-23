package com.wangzs.jatpackstudy

import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.viewbinding.ViewBinding
import com.wangzs.jatpackstudy.viewmodel.BaseViewModel

abstract class BaseVmActivity<VB : ViewBinding, VM : BaseViewModel> : BaseActivity<VB>() {
    protected open lateinit var mViewModel: VM


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initViewModel()
        observer()
        initView()
        initData()
        setListener()
    }

    open fun setListener() {
    }

    open fun initData() {

    }

    open fun initView() {

    }


    /**
     * 订阅退出登录逻辑
     */
    private fun observer() {
        mViewModel.needLogin.observe(this) {
            //如果未登录，跳转到登录页面
            if (it) {
                //跳转登录页面

            }
        }
    }

    private fun initViewModel() {
        mViewModel = ViewModelProvider(this)[viewModelClass()]
    }

    abstract fun viewModelClass(): Class<VM>

    override fun onDestroy() {
        super.onDestroy()

    }
}
