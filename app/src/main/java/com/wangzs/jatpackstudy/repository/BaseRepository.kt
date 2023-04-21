package com.wangzs.jatpackstudy.repository

import com.wangzs.jatpackstudy.api.ApiService
import com.wangzs.jatpackstudy.net.RetrofitClient

open class BaseRepository {

    protected fun apiService(): ApiService {
        return RetrofitClient.create(ApiService::class.java)
    }

}
