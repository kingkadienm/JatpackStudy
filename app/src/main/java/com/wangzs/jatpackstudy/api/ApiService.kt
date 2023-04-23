package com.wangzs.jatpackstudy.api

import com.wangzs.jatpackstudy.bean.BaseResponse
import com.wangzs.jatpackstudy.bean.TestResponse
import com.wangzs.jatpackstudy.bean.User
import com.wangzs.jatpackstudy.bean.UserBean
import com.wangzs.jatpackstudy.net.RetrofitClient
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {

    companion object {
        private val retrofit = RetrofitClient.create(ApiService::class.java)

        @JvmStatic
        fun getInstance(): ApiService {
            return retrofit
        }
    }


    @GET("/user/getAllUser")
    suspend fun getData(): TestResponse<List<User>>

    @GET("/article/list/{page_count}/json")
    suspend fun getDatas(
        @Path("page_count") page_count: Int,
        @Query("page_size") page_size: Int
    ): BaseResponse<UserBean>
//
//    suspend fun getData1(): TestResponse<UserBean>


}