package com.example.shoppingapp.list.model

import com.squareup.moshi.Json
import com.squareup.moshi.JsonClass
import java.io.Serializable

@JsonClass(generateAdapter = true)
data class Items(
    val id: Int,
    val title: String,
    val description: String,
    val image: String) : Serializable
