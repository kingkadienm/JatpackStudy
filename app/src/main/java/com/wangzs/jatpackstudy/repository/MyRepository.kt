package com.wangzs.jatpackstudy.repository

import com.wangzs.jatpackstudy.api.ApiService
import com.wangzs.jatpackstudy.bean.BaseResponse
import com.wangzs.jatpackstudy.bean.TestResponse
import com.wangzs.jatpackstudy.bean.User
import com.wangzs.jatpackstudy.bean.UserBean

class MyRepository : BaseRepository() {


    suspend fun getData(): TestResponse<List<User>> {
        return apiService().getData();
    }

    suspend fun getDatas(pageSize: Int): BaseResponse<UserBean> {
        return apiService().getDatas(pageSize);
    }

}