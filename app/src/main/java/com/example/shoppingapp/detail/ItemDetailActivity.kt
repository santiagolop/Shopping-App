package com.example.shoppingapp.detail

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.shoppingapp.detail.interfaces.DetailContract
import com.example.shoppingapp.detail.model.DetailModel
import com.example.shoppingapp.detail.model.ItemsDatabase
import com.example.shoppingapp.detail.presenter.DetailPresenter
import com.example.shoppingapp.detail.view.DetailView


class ItemDetailActivity : AppCompatActivity() {
    private lateinit var presenter: DetailContract.Presenter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter = DetailPresenter(DetailView(this), DetailModel(ItemsDatabase.getDatabase(this).favoriteItemsDao()))
    }
}