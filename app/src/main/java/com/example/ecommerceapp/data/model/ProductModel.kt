package com.example.ecommerceapp.data.model

import androidx.room.TypeConverters
import com.example.ecommerceapp.data.model.Converters.ReviewTypeConverters
import java.io.Serializable


data class ProductModel(
    val productId: Int,
    val productImage: Int,
    val productTitle: String,
    val productDescription: String,
    val productPrice: Int,
    val productCategory: CategoriesModel?=null,
    val productBrand: BrandModel?=null,
    val productStateNew: Boolean = false,
    @TypeConverters(ReviewTypeConverters::class)
    val productReviews: List<ReviewModel>?=null
) : Serializable

