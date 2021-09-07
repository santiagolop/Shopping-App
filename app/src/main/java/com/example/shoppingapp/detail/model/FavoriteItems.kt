package com.example.shoppingapp.detail.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity (tableName = "favoriteItems")
data class FavoriteItems(
    @ColumnInfo(name = "id")
    @PrimaryKey(autoGenerate = true)
    val id : Int,
    @ColumnInfo(name = "title")
    val title : String,
    @ColumnInfo(name = "image")
    val image : String,
    @ColumnInfo(name = "description")
    val description : String
)
