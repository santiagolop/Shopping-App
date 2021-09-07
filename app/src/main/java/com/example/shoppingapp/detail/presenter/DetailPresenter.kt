package com.example.shoppingapp.detail.presenter

import com.example.shoppingapp.detail.interfaces.DetailContract
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class DetailPresenter(view: DetailContract.View, model: DetailContract.Model): DetailContract.Presenter {

    init {
        view.showDetail()
        view.onSaveButtonClicked {
            CoroutineScope(Dispatchers.IO).launch {
                model.saveItem(it)
            }
        }
        view.onDeleteButtonClicked {
            CoroutineScope(Dispatchers.IO).launch {
                model.deleteItem(it)
            }
        }
    }
}