package com.example.ecommerceapp.adapter

import androidx.recyclerview.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import com.bumptech.glide.Glide
import com.example.ecommerceapp.R
import com.example.ecommerceapp.data.model.FavouriteModel
import com.example.ecommerceapp.databinding.ItemFavouriteBinding


class FavouritesAdapter() : RecyclerView.Adapter<FavouritesAdapter.FavoriteViewHolder>() {
    private var favoriteProducts: List<FavouriteModel> = ArrayList()
    private lateinit var onFavoriteClickListener: OnFavoriteClickListener
    private lateinit var onFavoriteLongClickListener: OnFavoriteLongClickListener


    val differCallBack = object : DiffUtil.ItemCallback<FavouriteModel>() {
        override fun areItemsTheSame(oldItem: FavouriteModel, newItem: FavouriteModel): Boolean {
            return oldItem.productTitle == newItem.productTitle
        }

        override fun areContentsTheSame(oldItem: FavouriteModel, newItem: FavouriteModel): Boolean {
            return oldItem == newItem
        }

    }

    val differ = AsyncListDiffer(this, differCallBack)



    class FavoriteViewHolder(val binding: ItemFavouriteBinding) :
        RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FavoriteViewHolder {
        return FavoriteViewHolder(ItemFavouriteBinding.inflate(LayoutInflater.from(parent.context)))
    }

    override fun onBindViewHolder(holder: FavoriteViewHolder, position: Int) {
        val items = differ.currentList[position]

        holder.binding.apply {
            favProductName.text = items.productTitle
            favProductDescription.text = items.productDescription
            favProductPrice.text = items.productPrice.toString()
            Glide.with(holder.itemView)
                .load(items.productImage)
                .error(R.drawable.ic_baseline_error_outline_24)
                .into(favProductImage)
        }

        holder.itemView.setOnClickListener { onItemClickListener?.let { it(items) } }
        holder.itemView.setOnLongClickListener(object : View.OnLongClickListener {
            override fun onLongClick(p0: View?): Boolean {
                onFavoriteLongClickListener.onFavoriteLongCLick(items)
                return true
            }
        })
    }

    override fun getItemCount(): Int {
        return differ.currentList.size
    }

    interface OnFavoriteClickListener {
        fun onFavoriteClick(product: FavouriteModel)
    }

    interface OnFavoriteLongClickListener {
        fun onFavoriteLongCLick(product: FavouriteModel)
    }
    private var onItemClickListener: ((FavouriteModel) -> Unit)? = null
    fun onItemClicked(listner: (FavouriteModel) -> Unit) {
        onItemClickListener = listner
    }
}