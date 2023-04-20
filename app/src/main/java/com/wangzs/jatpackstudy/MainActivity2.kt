package com.wangzs.jatpackstudy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.wangzs.jatpackstudy.api.ApiService
import com.wangzs.jatpackstudy.bean.TestResponse
import com.wangzs.jatpackstudy.bean.User
import com.wangzs.jatpackstudy.databinding.ActivityMainBinding
import com.wangzs.jatpackstudy.repository.MyRepository
import com.wangzs.jatpackstudy.viewmodel.UserViewModel

class MainActivity2 : AppCompatActivity() {
    val TAG = this.javaClass.name

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val myRepository = MyRepository(ApiService.getInstance())

        val viewModel = UserViewModel(myRepository)

        viewModel.datas.observe(this) {
            Log.e(TAG, "onCreate: ${it.toString()}")
            binding.viewModel = viewModel
        }
        viewModel.dataChange()
    }
}