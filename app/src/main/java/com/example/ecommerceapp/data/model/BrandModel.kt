package com.example.ecommerceapp.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


data class BrandModel(
    val brandImage: Int,
    val branTitle: String,
    val brandProductsNumber: Int
)
