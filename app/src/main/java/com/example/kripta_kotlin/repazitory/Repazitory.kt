package com.example.kripta_kotlin.repazitory

import com.example.kripta_kotlin.data.remote.Retrofit_Kripta
import com.example.kripta_kotlin.model.Kripto
import retrofit2.Response

class Repazitory {
    suspend fun getKripta(key:String) :Response<List<Kripto>> {
        return Retrofit_Kripta.api.getCripta(key)
    }
}