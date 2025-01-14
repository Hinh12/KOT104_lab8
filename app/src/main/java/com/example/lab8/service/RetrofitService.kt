package com.example.lab8.service

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

open class RetrofitService {
    private val retrofit: Retrofit = Retrofit.Builder()
        //.baseUrl("http://10.0.2.2:3000/")
//        .baseUrl("https://652670da917d673fd76c444b.mockapi.io/api/")
        .baseUrl("https://65bb2eaa52189914b5bb5dfd.mockapi.io/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    val movieService: MovieService by lazy {
        retrofit.create(MovieService::class.java)
    }
}