package com.wangzs.android.mvp.model;


import com.wangzs.android.mvp.callback.LoginCallBack;

public class LoginModel implements ILoginModel {
    private LoginCallBack mCallBack;

    // 此处用构造方法 将P 和 M 连接起来，具体的连接就是接口
    public LoginModel(LoginCallBack callBack) {
        this.mCallBack = callBack;
    }

    @Override
    public void login(String name, String password) {

        if (name.equals(password)) {
            mCallBack.success();
        } else {
            mCallBack.failed();
        }
    }
}