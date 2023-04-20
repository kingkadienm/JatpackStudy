package com.wangzs.jatpackstudy.bean;

import android.util.Log;

import androidx.databinding.BaseObservable;
import androidx.databinding.Bindable;

import com.wangzs.jatpackstudy.BR;

public class TestResponse<T> extends BaseObservable {
    private int code;
    private String message;
    private T result;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    @Bindable
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
        notifyPropertyChanged(BR.message);
    }

    @Bindable
    public T getResult() {
        return result;
    }

    public void setResult(T result) {
        this.result = result;
        Log.e("setData", "setData: " );
        notifyPropertyChanged(BR.result);
    }

    @Override
    public String toString() {
        return "TestResponse{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", result=" + result +
                '}';
    }
}
