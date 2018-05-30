package com.tianyae.usercenter.data.respository

import com.tianyae.baselibrary.data.net.RetrofitFactory
import com.tianyae.baselibrary.data.protocol.BaseRespone
import com.tianyae.usercenter.data.api.UserApi
import com.tianyae.usercenter.data.protocol.RegisterRequest
import io.reactivex.Observable
import retrofit2.Retrofit

class UserRepository {
    fun register(mobile: String, verifyCode: String, pwd: String): Observable<BaseRespone<String>> {
        return RetrofitFactory.instance.create(UserApi::class.java)
                .register(RegisterRequest(mobile, pwd, verifyCode))
    }
}