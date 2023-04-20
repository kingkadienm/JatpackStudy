package com.wangzs.jatpackstudy.bean

import androidx.databinding.BaseObservable


import androidx.databinding.Bindable
import com.wangzs.jatpackstudy.BR


class User : BaseObservable() {

    @get:Bindable
    var user_id: String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.user_id)
        }

    @get:Bindable
    var user_name: String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.user_name)
        }

    @get:Bindable
    var user_password: String = ""
        set(value) {
            field = value
            notifyPropertyChanged(BR.user_password)
        }

    override fun toString(): String {
        return "User(user_id='$user_id', user_name='$user_name', user_password='$user_password')"
    }

}

