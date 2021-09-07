package com.example.shoppingapp.list

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.shoppingapp.R
import com.example.shoppingapp.databinding.ItemShoppingBinding
import com.example.shoppingapp.list.model.Items
import com.squareup.picasso.Picasso

class ShoppingAdapter(private val shoppingItems: List<Items>, val onClick: (Items) -> Unit): RecyclerView.Adapter<ShoppingAdapter.ItemViewHolder>(){

    class ItemViewHolder(view: View): RecyclerView.ViewHolder(view) {
        private val binding = ItemShoppingBinding.bind(view)
        fun bind(shoppingItems: Items){
            Picasso.get().load(shoppingItems.image).into(binding.imageView)
            binding.textView2.text = shoppingItems.title
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ItemViewHolder(layoutInflater.inflate(R.layout.item_shopping, parent, false))
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.bind(shoppingItems[position])

        holder.itemView.setOnClickListener {
            onClick(shoppingItems[position])
        }
    }

    override fun getItemCount(): Int = shoppingItems.size

}