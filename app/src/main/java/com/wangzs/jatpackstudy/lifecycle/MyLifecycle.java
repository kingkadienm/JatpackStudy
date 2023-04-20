package com.wangzs.jatpackstudy.lifecycle;

import android.util.Log;

import androidx.annotation.NonNull;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.OnLifecycleEvent;

import com.wangzs.jatpackstudy.bean.BaseResponse;
import com.wangzs.jatpackstudy.bean.UserBean;

/**
 * @Description:
 * @Author: wangzs
 * @Date: 2022-03-09 22:15
 * @Version:
 */
public class MyLifecycle implements DefaultLifecycleObserver {

    private static final String TAG = "MyLifecycle";

    @Override
    public void onCreate(@NonNull LifecycleOwner owner) {
        Log.e(TAG, "onCreate: " + owner.getClass());

    }

    @Override
    public void onDestroy(@NonNull LifecycleOwner owner) {
        DefaultLifecycleObserver.super.onDestroy(owner);
        Log.e(TAG, "onDestroy: " + owner.getClass());
    }

    @Override
    public void onPause(@NonNull LifecycleOwner owner) {
        DefaultLifecycleObserver.super.onPause(owner);
        Log.e(TAG, "onPause: " + owner.getClass());
    }

    @Override
    public void onResume(@NonNull LifecycleOwner owner) {
        DefaultLifecycleObserver.super.onResume(owner);
        Log.e(TAG, "onResume: " + owner.getClass());
    }

    @Override
    public void onStart(@NonNull LifecycleOwner owner) {
        DefaultLifecycleObserver.super.onStart(owner);
        Log.e(TAG, "onStart: " + owner.getClass());
    }

    @Override
    public void onStop(@NonNull LifecycleOwner owner) {
        DefaultLifecycleObserver.super.onStop(owner);
        Log.e(TAG, "onStop: " + owner.getClass());
    }
}
