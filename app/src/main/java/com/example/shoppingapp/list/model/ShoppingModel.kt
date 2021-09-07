package com.example.shoppingapp.list.model

import com.example.shoppingapp.list.interfaces.ApiService
import com.example.shoppingapp.list.interfaces.ShoppingContract
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

class ShoppingModel : ShoppingContract.Model {

    companion object {
        const val URL = "https://fakestoreapi.com/"
    }

    private fun getRetrofit(): ApiService {
        return Retrofit.Builder()
            .baseUrl(URL)
            .addConverterFactory(MoshiConverterFactory.create())
            .build()
            .create(ApiService::class.java)
    }

    override suspend fun getItems(): List<Items> {
        return withContext(Dispatchers.IO) {
            getRetrofit().getItems()
        }
    }
}