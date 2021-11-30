package com.example.kripta_kotlin.data.remote

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object Retrofit_Kripta {
 private   val retrofit by lazy {
        Retrofit.Builder().baseUrl("https://api.nomics.com/v1/")
            .addConverterFactory(GsonConverterFactory.create()).build()
    }
    val api by lazy {
        retrofit.create(Api_Kripta::class.java)
    }
}