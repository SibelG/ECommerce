package com.example.ecommerceapp.data.model

import android.os.Parcelable
import androidx.room.Entity
import androidx.room.PrimaryKey
import kotlinx.parcelize.Parcelize

@Parcelize
@Entity
data class FavouriteModel(
    @PrimaryKey
    val productId: Int,
    val productImage: Int,
    val productTitle: String,
    val productDescription: String,
    val productPrice: Int,
    val productBrandName: String
):Parcelable