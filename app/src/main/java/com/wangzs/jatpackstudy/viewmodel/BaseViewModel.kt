package com.wangzs.jatpackstudy.viewmodel

import android.os.Bundle
import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch


abstract class BaseViewModel : ViewModel() {
    protected val TAG = this.javaClass.name
    protected val _isLoading = MutableLiveData<Boolean>()
    val isLoading: LiveData<Boolean> = _isLoading

    protected val _errorMsg = MutableLiveData<String>()
    val errorMsg: LiveData<String> = _errorMsg

    protected fun launch(block: suspend () -> Unit) {
        viewModelScope.launch {
            try {
                _isLoading.value = true
                block()
            } catch (e: Exception) {
                _errorMsg.value = e.message
            } finally {
                _isLoading.value = false
            }
        }
    }

    val loadStateLiveData = MutableLiveData<LoadState>()
    val hasMoreStateLiveData = MutableLiveData<HasMoreState>()

    open fun init(arguments: Bundle?) {}

    /**
     * 加载数据开始  用调用V层的loadStart
     */
    protected fun loadStart() {
        loadStateLiveData.value = LoadState.LoadStart
    }

    /**
     * 加载数据结束  用调用V层的loadFinish
     */
    protected fun loadFinish(success: Boolean) {
        if (success) {
            loadStateLiveData.setValue(LoadState.LoadSuccess)
        } else {
            loadStateLiveData.setValue(LoadState.LoadFail)
        }
    }

    /**
     * 是否有更多数据  用调用V层的HasMore和noMore
     */
    protected fun hasMore(hasMore: Boolean) {
        if (hasMore) {
            hasMoreStateLiveData.value = HasMoreState.HasMore
        } else {
            hasMoreStateLiveData.value = HasMoreState.NoMore
        }
    }

    override fun onCleared() {
        Log.v("BaseViewModel", this.javaClass.name + this + " onCleared()")
        super.onCleared()
    }

}
enum class LoadState {
    LoadStart, LoadSuccess, LoadFail
}
enum class HasMoreState {
    HasMore, NoMore
}