package com.wangzs.jatpackstudy.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.wangzs.jatpackstudy.bean.User;

public class MyViewModel extends ViewModel {
    private MutableLiveData<User> user;

    public MutableLiveData<User> getUsers() {
        if (user == null) {
            user = new MutableLiveData<User>();
        }
        return user;
    }

    public void setUser(MutableLiveData<User> user) {
        this.user = user;
    }
}
