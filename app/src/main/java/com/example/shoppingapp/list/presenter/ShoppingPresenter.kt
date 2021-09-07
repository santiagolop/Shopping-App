package com.example.shoppingapp.list.presenter

import com.example.shoppingapp.list.interfaces.ShoppingContract
import com.example.shoppingapp.list.model.ShoppingModel
import com.example.shoppingapp.list.view.ShoppingView
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class ShoppingPresenter(view: ShoppingContract.View, model: ShoppingContract.Model) : ShoppingContract.Presenter {

    init {
        CoroutineScope(Dispatchers.Main).launch {
            view.showItems(model.getItems())
        }
    }
}