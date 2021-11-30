package com.example.kripta_kotlin.data.remote

import com.example.kripta_kotlin.model.Kripto
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface Api_Kripta {
    @GET("markets")
    suspend fun getCripta(@Query("key")key: String):Response<List<Kripto>>
}//https://api.nomics.com/?key=72df73968c09b3140e80dd44433ce52e813e965c