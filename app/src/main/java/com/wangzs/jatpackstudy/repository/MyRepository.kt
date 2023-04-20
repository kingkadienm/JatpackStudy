package com.wangzs.jatpackstudy.repository

import com.wangzs.jatpackstudy.api.ApiService
import com.wangzs.jatpackstudy.bean.BaseResponse
import com.wangzs.jatpackstudy.bean.TestResponse
import com.wangzs.jatpackstudy.bean.User
import com.wangzs.jatpackstudy.bean.UserBean

class MyRepository(private val api: ApiService) {

    suspend fun getData(): TestResponse<List<User>> {
        return api.getData();
    }

    suspend fun getDatas(pageSize: Int): BaseResponse<UserBean> {
        return api.getDatas(pageSize);
    }

}