package com.example.shoppingapp.list.view

import android.app.Activity
import android.content.Intent
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.shoppingapp.*
import com.example.shoppingapp.detail.ItemDetailActivity
import com.example.shoppingapp.list.model.Items
import com.example.shoppingapp.list.ShoppingAdapter
import com.example.shoppingapp.list.interfaces.ShoppingContract
import com.example.shoppingapp.databinding.ActivityMainBinding
import com.example.shoppingapp.detail.view.DetailView

class ShoppingView(private val activity: Activity) : ShoppingContract.View {

    private val binding : ActivityMainBinding = ActivityMainBinding.inflate(activity.layoutInflater)

    init {
        activity.setContentView(binding.root)
    }

    override suspend fun showItems(items: List<Items>) {
        val adapter = ShoppingAdapter(items,this::onItemClicked)
        binding.recycler.layoutManager = LinearLayoutManager(activity)
        binding.recycler.adapter = adapter
        adapter.notifyDataSetChanged()
    }

    override fun onItemClicked(items: Items) {
        val intent = Intent(activity, ItemDetailActivity::class.java)
        intent.putExtra(DetailView.ITEMS, items)
        activity.startActivity(intent)
    }
}