package com.example.kripta_kotlin.ui.main

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.kripta_kotlin.model.Kripto
import com.example.kripta_kotlin.repazitory.Repazitory
import kotlinx.coroutines.launch
import retrofit2.Response

class MainVievModel(val repazitory : Repazitory) : ViewModel() {
    val myResource : MutableLiveData<Response<List<Kripto>>> = MutableLiveData()

    fun getKripta(key:String) {
        viewModelScope.launch {
            val result = repazitory.getKripta(key)
            myResource.value =result
        }
    }
}