package com.example.kripta_kotlin.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.kripta_kotlin.R
import com.example.kripta_kotlin.databinding.ActivityMainBinding
import com.example.kripta_kotlin.recyclerView.KriptaAdapter
import com.example.kripta_kotlin.repazitory.Repazitory

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private lateinit var mainVievModel : MainVievModel

    val adapter by lazy { KriptaAdapter(this) }
    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()
        initVirvModel()
        getKriptaFromApi()


    }

    private fun initRecyclerView() {
        val recyclerView = findViewById<RecyclerView>(R.id.recyclerViewKripto)
        recyclerView.adapter = adapter
    }

    private fun getKriptaFromApi() {
        mainVievModel.getKripta("72df73968c09b3140e80dd44433ce52e813e965c")
     mainVievModel.myResource.observe(this, Observer {
         adapter.setData(it.body()!!)

     })

    }

    private fun initVirvModel() {
        val repazitory = Repazitory()
    val     mainVievModelProvider = MainVievModelProvider(repazitory)
        mainVievModel =
            ViewModelProvider(this, mainVievModelProvider).get(MainVievModel::class.java)
    }
}