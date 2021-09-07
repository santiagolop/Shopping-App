package com.example.shoppingapp.list.interfaces

import com.example.shoppingapp.list.model.Items
import retrofit2.http.GET

interface ApiService {
    @GET("products/")
    suspend fun getItems() : List<Items>
}