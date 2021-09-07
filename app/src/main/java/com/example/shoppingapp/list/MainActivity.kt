package com.example.shoppingapp.list

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.shoppingapp.list.interfaces.ShoppingContract
import com.example.shoppingapp.list.model.ShoppingModel
import com.example.shoppingapp.list.presenter.ShoppingPresenter
import com.example.shoppingapp.list.view.ShoppingView

class MainActivity : AppCompatActivity() {
    private lateinit var presenter: ShoppingContract.Presenter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        presenter = ShoppingPresenter(ShoppingView(this), ShoppingModel())
    }
}