package com.example.post_mvvm_retrofit.network

import com.example.post_mvvm_retrofit.model.RequestModel
import com.example.post_mvvm_retrofit.model.Student
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.POST

interface ApiInterface {

    @Headers("Content-Type: application/json")
    @POST("InstructorStudentList")
    suspend fun getStudentData(
        @Header("HashToken") hashToken: String,
        @Body requestBody: RequestModel
    ): Student
}