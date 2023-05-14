package com.wangzs.jatpackstudy.viewmodel

import android.content.Intent
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.databinding.BaseObservable
import androidx.databinding.BindingAdapter
import androidx.databinding.ObservableField
import androidx.lifecycle.*
import com.wangzs.jatpackstudy.MainActivity
import com.wangzs.jatpackstudy.bean.BaseResponse
import com.wangzs.jatpackstudy.repository.MyRepository
import com.wangzs.jatpackstudy.bean.TestResponse
import com.wangzs.jatpackstudy.bean.User
import com.wangzs.jatpackstudy.bean.UserBean
import kotlinx.coroutines.launch

class UserViewModel : BaseViewModel() {

    private val repository by lazy {
        MyRepository()
    }

    private val data = MutableLiveData<TestResponse<List<User>>>()
    var datas = MutableLiveData<BaseResponse<UserBean>>()


//    override fun loadData(isRefresh: Boolean, data: List<UserBean>, totalPage: Int) {
//        super.loadData(isRefresh, data, totalPage)
//    }

    fun dataChange() {
        launch(block = {
           val bean=  repository.getDatas(mCurrentPage, mCurrentSize)
            if (hasMore){
                val userBean = bean.data



            }



        }, error = {

        }, showErrorToast = true)
    }

    fun onClick(view: View) {
        val context = view.context
        val intent = Intent(context, MainActivity::class.java)
        context.startActivity(intent)
    }
}

