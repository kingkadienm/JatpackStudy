package com.wangzs.android.mvp.presenter;

import com.wangzs.android.mvp.callback.LoginCallBack;
import com.wangzs.android.mvp.model.ILoginModel;
import com.wangzs.android.mvp.model.LoginModel;
import com.wangzs.android.mvp.view.ILoginView;

public class LoginPresenter implements LoginCallBack {

    private ILoginView mLoginView;
    private ILoginModel mLoginModel;


    public LoginPresenter(ILoginView loginView) {
        this.mLoginView = loginView;
        mLoginModel = new LoginModel(this);
    }

    public void login(String name, String password) {
        mLoginModel.login(name, password);
    }

    @Override
    public void success() {
        mLoginView.showToastSuccess();
    }

    @Override
    public void failed() {
        mLoginView.showToastFailed();
    }
}
