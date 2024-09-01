package com.example.post_mvvm_retrofit.repository

import com.example.post_mvvm_retrofit.model.RequestModel
import com.example.post_mvvm_retrofit.network.ApiInterface
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

class UserRepository {

    private val BASE_URL = "https://testapi.ultimatedrivers.ca/api/"
    private val api: ApiInterface

    init {

        val okHttpClient = OkHttpClient.Builder()
            .connectTimeout(100, TimeUnit.SECONDS)
            .readTimeout(100, TimeUnit.SECONDS)


        val retrofit =
            Retrofit.Builder().baseUrl(BASE_URL)
                .client(okHttpClient.build())
                .addConverterFactory(GsonConverterFactory.create())
                .build()

        api = retrofit.create(ApiInterface::class.java)
    }


    val hashToken = "e9a9b11e-9630-486e-af79-7e0fa3d81278"

    val body = RequestModel(
        "1477",
        "1",
        "2024",
        "ALL",
        "",
        "",
        "",
        "",
        "1",
        "")

    suspend fun getStudents() = api.getStudentData(hashToken,body)
}