package com.example.shoppingapp.detail.model

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.example.shoppingapp.detail.interfaces.ItemsDao

@Database (entities = [FavoriteItems::class], version = 1)
abstract class ItemsDatabase : RoomDatabase() {

    abstract fun favoriteItemsDao() : ItemsDao

    companion object {
        private var itemsDatabase: ItemsDatabase? = null
        fun getDatabase(context: Context) : ItemsDatabase {
            return itemsDatabase ?:
                Room.databaseBuilder(
                    context,
                    ItemsDatabase::class.java,
                    "favoriteItems"
                ).build()
        }
    }
}