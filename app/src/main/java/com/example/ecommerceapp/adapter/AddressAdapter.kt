package com.example.ecommerceapp.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.AsyncListDiffer
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import com.example.ecommerceapp.R
import com.example.ecommerceapp.data.model.AddressModel
import com.example.ecommerceapp.databinding.FragmentAddressBinding
import  com.example.ecommerceapp.databinding.ItemShippingAddressBinding
import kotlin.concurrent.fixedRateTimer

class AddressAdapter() : RecyclerView.Adapter<AddressAdapter.ViewHolder>() {

    private var _binding: ItemShippingAddressBinding? = null

    inner class ViewHolder(val binding: ItemShippingAddressBinding) :
        RecyclerView.ViewHolder(binding.root)

    val differCallBack = object : DiffUtil.ItemCallback<AddressModel>() {
        override fun areItemsTheSame(oldItem: AddressModel, newItem: AddressModel): Boolean {
            return oldItem.addressTitle == newItem.addressTitle
        }

        override fun areContentsTheSame(oldItem: AddressModel, newItem: AddressModel): Boolean {
            return oldItem == newItem
        }

    }

    val differ = AsyncListDiffer(this, differCallBack)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        _binding =
            ItemShippingAddressBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(_binding!!)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        val currentAddress = differ.currentList[position]

        holder.binding.apply {
            addressTitle.text = currentAddress.addressTitle
            addressBody.text = currentAddress.addressBody
        }

        if (currentAddress.addressIsChecked)
            holder.binding.addressChecked.setImageResource(R.drawable.checkbox_fill)
        else
            holder.binding.addressChecked.setImageResource(R.drawable.checkbox_null)
    }

    override fun getItemCount(): Int = differ.currentList.size


}