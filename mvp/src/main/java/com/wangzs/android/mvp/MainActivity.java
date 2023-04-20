package com.wangzs.android.mvp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.wangzs.android.mvp.presenter.LoginPresenter;
import com.wangzs.android.mvp.view.ILoginView;

public class MainActivity extends AppCompatActivity implements ILoginView {

    private EditText etName, etPassword;
    private LoginPresenter mLoginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etName = findViewById(R.id.et_name);
        etPassword = findViewById(R.id.et_password);
        mLoginPresenter = new LoginPresenter(this);
    }

    public void Login(View view) {
        mLoginPresenter.login(etName.getText().toString(), etPassword.getText().toString());
    }

    @Override
    public void showToastFailed() {
        Toast.makeText(this, "登陆失败", Toast.LENGTH_LONG).show();
    }

    @Override
    public void showToastSuccess() {
        Toast.makeText(this, "登陆成功", Toast.LENGTH_LONG).show();
    }
}