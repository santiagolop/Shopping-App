package com.example.shoppingapp.detail.view

import android.app.Activity
import com.example.shoppingapp.detail.interfaces.DetailContract
import com.squareup.picasso.Picasso
import com.example.shoppingapp.databinding.ItemDetailBinding
import com.example.shoppingapp.list.model.Items


class DetailView(private val activity: Activity) : DetailContract.View {

    companion object {
        const val ITEMS = "ITEMS"
    }

    private val binding : ItemDetailBinding = ItemDetailBinding.inflate(activity.layoutInflater)
    private val item : Items = activity.intent.extras?.get(ITEMS) as Items

    init {
        activity.setContentView(binding.root)
    }

    override fun showDetail() {
        Picasso.get().load(item.image).into(binding.imageItem)
        binding.textTitle.text = item.title
        binding.textDescription.text = item.description
    }

    override fun onSaveButtonClicked(onClick: (Items) -> Unit) {
        binding.buttonSave.setOnClickListener {
            onClick(item)
        }
    }

    override fun onDeleteButtonClicked(onClick: (Int) -> Unit) {
        binding.buttonDelete.setOnClickListener {
            onClick(item.id)
        }
    }
}