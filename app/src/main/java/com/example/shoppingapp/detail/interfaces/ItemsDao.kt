package com.example.shoppingapp.detail.interfaces

import androidx.room.*
import com.example.shoppingapp.detail.model.FavoriteItems

@Dao
interface ItemsDao {

    @Insert (onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(item: FavoriteItems)

    @Query("DELETE FROM favoriteItems WHERE id = :id")
    fun delete(id:Int)
}
