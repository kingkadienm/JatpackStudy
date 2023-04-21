package com.wangzs.jatpackstudy.viewmodel

import android.annotation.SuppressLint
import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.google.gson.JsonParseException
import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import retrofit2.HttpException
import java.net.ConnectException
import java.net.SocketTimeoutException
import java.net.UnknownHostException

typealias Block<T> = suspend (CoroutineScope) -> T
typealias Error = suspend (Exception) -> Unit
typealias Cancel = suspend (Exception) -> Unit

open class BaseViewModel : ViewModel() {
    var TAG = "BaseViewModel"
    val needLogin = MutableLiveData<Boolean>().apply { value = false }
    protected fun launch(
        block: Block<Unit>,
        error: Error? = null,
        cancel: Cancel? = null,
        showErrorToast: Boolean = true,
    ): Job {
        return viewModelScope.launch {
            try {
                block.invoke(this)
            } catch (e: Exception) {
                when (e) {
                    is CancellationException -> {
                        cancel?.invoke(e)
                    }

                    else -> {
                        onError(e, showErrorToast)
                        error?.invoke(e)
                    }
                }

            }
        }
    }

    /**
     * 统一处理错误
     * @param e 异常
     * @param showErrorToast 是否显示错误吐司
     */
    @SuppressLint("WrongConstant")
    private fun onError(e: Exception, showErrorToast: Boolean) {
        when (e) {
            //可以处理是否登录逻辑
//            needLogin = false
            // 网络请求失败
            is ConnectException, is SocketTimeoutException, is UnknownHostException, is HttpException -> {
                if (showErrorToast) {
//                    Toast.makeText(AppHelper.mContext, "网络请求失败", 1000).show()
                }

                Log.e(TAG, "网络请求失败" + e.toString())


            }
            // 数据解析错误
            is JsonParseException -> {
                Log.e(TAG, "数据解析错误" + e.toString())

            }
            // 其他错误
            else -> {
                Log.e(TAG, "其他错误" + e.toString())

            }

        }
    }

}
