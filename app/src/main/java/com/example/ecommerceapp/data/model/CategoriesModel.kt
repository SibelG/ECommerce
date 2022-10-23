package com.example.ecommerceapp.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import java.io.Serializable


data class CategoriesModel(
    val categoryIcon: Int,
    val categoryTitle: String
)