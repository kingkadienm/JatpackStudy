package com.wangzs.jatpackstudy

import android.app.Application
import android.util.Log
import androidx.lifecycle.DefaultLifecycleObserver
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.ProcessLifecycleOwner
import com.wangzs.jatpackstudy.lifecycle.MyLifecycle

/**
 * @Description:
 * @Author: wangzs
 * @Date: 2022-03-09 22:13
 * @Version:
 */
class MyApplication : Application() {

    val TAG = "MyApplication"
    private val processLifecycleObserver by lazy {
        object : DefaultLifecycleObserver {
            override fun onStart(owner: LifecycleOwner) {
                Log.e(TAG, "onStart:前台 $isForeground")
            }

            override fun onStop(owner: LifecycleOwner) {
                Log.e(TAG, "onStop:后台 $isForeground")
            }
        }

    }

    override fun onCreate() {
        super.onCreate()
        ProcessLifecycleOwner.get().lifecycle.addObserver(MyLifecycle())
        ProcessLifecycleOwner.get().lifecycle.addObserver(processLifecycleObserver)

    }

    companion object {
        val isForeground
            get() = ProcessLifecycleOwner.get().lifecycle.currentState.isAtLeast(
                Lifecycle.State.STARTED
            )
    }

}