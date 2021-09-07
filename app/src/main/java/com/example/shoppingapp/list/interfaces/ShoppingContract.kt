package com.example.shoppingapp.list.interfaces

import com.example.shoppingapp.list.model.Items

interface ShoppingContract {

    interface View {
        suspend fun showItems(items: List<Items>)
        fun onItemClicked(items: Items)
    }

    interface Presenter {
    }

    interface Model{
        suspend fun getItems(): List<Items>
    }
}