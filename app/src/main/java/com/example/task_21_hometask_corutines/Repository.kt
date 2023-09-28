package com.example.task_21_hometask_corutines

import retrofit2.Response
import retrofit2.Retrofit

class Repository(client: Retrofit) {
    private val apiInterface = client.create(ApiInterface::class.java)
//    suspend fun getCurrencyByName(name:String):BitcoinResponce{
//        return apiInterface.getCryptoByName(name)
//    }
    suspend fun getSuperHero() : Response<List<SuperHero>>{ //Response<List<SuperHero>> {
        return apiInterface.getSuperHero()
    }
}