package com.wangzs.jatpackstudy


import android.content.pm.ActivityInfo
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelStoreOwner
import androidx.viewbinding.ViewBinding
import com.wangzs.jatpackstudy.viewmodel.BaseViewModel
import java.lang.reflect.ParameterizedType

/**
 * Created by guoshichao on 2021/2/20
 * MVVM BaseActivity
 */
abstract class BaseActivity<VB : ViewBinding> : AppCompatActivity() {
    protected open var mBinding: VB? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mBinding = getViewBinding()
        setContentView(mBinding?.root)
         requestedOrientation = ActivityInfo.SCREEN_ORIENTATION_PORTRAIT//竖屏
        initialize()


    }

    open fun initialize() {
         Log.e("","")
    }

    abstract fun getViewBinding(): VB?
    override fun onDestroy() {
        super.onDestroy()
        mBinding = null
    }

}