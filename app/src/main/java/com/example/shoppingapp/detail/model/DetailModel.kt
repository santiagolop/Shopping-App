package com.example.shoppingapp.detail.model

import com.example.shoppingapp.detail.interfaces.DetailContract
import com.example.shoppingapp.detail.interfaces.ItemsDao
import com.example.shoppingapp.list.model.Items

class DetailModel(private val itemDB : ItemsDao): DetailContract.Model {

    override suspend fun saveItem(item: Items) = itemDB.insert(
        FavoriteItems(
            item.id,
            item.title,
            item.image,
            item.description
        )
    )

    override suspend fun deleteItem(id: Int) {
        itemDB.delete(id)
    }
}