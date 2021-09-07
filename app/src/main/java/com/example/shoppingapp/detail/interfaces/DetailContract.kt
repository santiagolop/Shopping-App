package com.example.shoppingapp.detail.interfaces

import com.example.shoppingapp.detail.model.FavoriteItems
import com.example.shoppingapp.list.model.Items

interface DetailContract {

    interface Model {
        suspend fun saveItem(item: Items)
        suspend fun deleteItem(id : Int)
    }

    interface Presenter {

    }

    interface View {
        fun showDetail()
        fun onSaveButtonClicked(onClick: (Items) -> Unit)
        fun onDeleteButtonClicked(onClick: (Int) -> Unit)

    }

}