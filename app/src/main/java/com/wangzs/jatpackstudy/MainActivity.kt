package com.wangzs.jatpackstudy

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.get
import com.wangzs.jatpackstudy.bean.User
import com.wangzs.jatpackstudy.databinding.ActivityMain2Binding
import com.wangzs.jatpackstudy.viewmodel.MyViewModel
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    var TAG = this.javaClass.name



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val inflate =
            DataBindingUtil.setContentView<ActivityMain2Binding>(this, R.layout.activity_main2)

        val model = ViewModelProvider(this).get(MyViewModel::class.java)

        inflate.btn.setOnClickListener {
            Log.e(TAG, "onCreate: ")
            inflate.imageNetwork =
                "https://img-blog.csdnimg.cn/0d611b315e8448f7a01f7a772c238c6f.png"
            val a = MutableLiveData<User>()
            val user = User()
            user.user_id = "111"
            user.user_name = "2222"
            user.user_password = "33333"
            a.value = user
            model.setUser(a)
            inflate.model = model

        }
        model.users.observe(this) {
            Log.e(TAG, "onCreate: ${it.toString()}")
        }

    }
}