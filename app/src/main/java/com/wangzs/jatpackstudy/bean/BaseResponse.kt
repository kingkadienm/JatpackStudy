package com.wangzs.jatpackstudy.bean

import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import com.wangzs.jatpackstudy.BR

class BaseResponse<T> : BaseObservable() {
    @get:Bindable
    var errorCode: Int = 0
        set(value) {
            field = value
            notifyPropertyChanged(BR.errorCode)
        }
    @get:Bindable
    var errorMsg: String = "-"
        set(value) {
            field = value
            notifyPropertyChanged(BR.errorMsg)
        }
    @get:Bindable
    var data: T? = null
        set(value) {
            field = value
            notifyPropertyChanged(BR.data)
        }
}