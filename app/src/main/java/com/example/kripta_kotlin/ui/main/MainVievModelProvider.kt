package com.example.kripta_kotlin.ui.main

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.kripta_kotlin.repazitory.Repazitory

class MainVievModelProvider(val repazitory : Repazitory):ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass : Class<T>) : T {
     return MainVievModel(repazitory) as T
    }
}