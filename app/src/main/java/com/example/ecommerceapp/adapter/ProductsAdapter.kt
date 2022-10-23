package com.example.ecommerceapp.adapter

import android.app.Fragment
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.ecommerceapp.R
import com.example.ecommerceapp.data.model.FavouriteModel
import com.example.ecommerceapp.data.model.ProductModel
import com.example.ecommerceapp.databinding.ItemExploreBinding
import com.example.ecommerceapp.viewmodel.ProductViewModel

class ProductsAdapter(private val productViewModel: ProductViewModel) : RecyclerView.Adapter<ProductsAdapter.ViewHolder>() {

    private val TAG = "ProductsAdapter"

    private var _binding: ItemExploreBinding? = null
    lateinit var favoriteProducts: FavouriteModel

    inner class ViewHolder(val binding: ItemExploreBinding) : RecyclerView.ViewHolder(binding.root)

    val differCallBack = object : DiffUtil.ItemCallback<ProductModel>() {
        override fun areItemsTheSame(oldItem: ProductModel, newItem: ProductModel): Boolean {
            return oldItem.productTitle == newItem.productTitle
        }

        override fun areContentsTheSame(oldItem: ProductModel, newItem: ProductModel): Boolean {
            return oldItem == newItem
        }

    }

    val differ = AsyncListDiffer(this, differCallBack)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        _binding = ItemExploreBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(_binding!!)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val items = differ.currentList[position]
        val id = items.productId

        //Log.i(TAG, "onBindViewHolder: ${items.productStateNew}")

        if (items.productStateNew) {
            Log.i(TAG, "onBindViewHolder: True")
            holder.binding.productState.exploreItemNewTag.visibility = View.VISIBLE
        } else {
            Log.i(TAG, "onBindViewHolder: False")
            holder.binding.productState.exploreItemNewTag.visibility = View.GONE
        }
        holder.binding.apply {
            exploreTitleTextView.text = items.productTitle
            exploreDescTextView.text = items.productDescription
            explorePriceTextView.text = "$" + items.productPrice.toString()
            exploreBrandTextView.text = items.productBrand.toString()

            Glide.with(_binding!!.root)
                .load(items.productImage)
                .into(exploreImageView)
            favoriteProducts=FavouriteModel(id,items.productImage,items.productTitle,items.productDescription,items.productPrice,items.productBrand.toString())
            favProduct.setOnClickListener(View.OnClickListener {
                if (productViewModel.getIsFavourites(id).equals(1)){
                    favProduct.setImageResource(R.drawable.ic_baseline_favorite_24)
                    productViewModel.insertFavourite(favoriteProducts);

                }else {
                    favProduct.setImageResource(R.drawable.ic_favorite_border)
                    productViewModel.deleteFavourite(favoriteProducts);
                }

            })

        }



        holder.itemView.setOnClickListener { onItemClickListener?.let { it(items) } }
    }

    override fun getItemCount(): Int {
        //Return the first two products and the other in the
        //See more page.
        return differ.currentList.size
    }


    private var onItemClickListener: ((ProductModel) -> Unit)? = null
    fun onItemClicked(listner: (ProductModel) -> Unit) {
        onItemClickListener = listner
    }
}