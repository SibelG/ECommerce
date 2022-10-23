package com.example.ecommerceapp.data.model

import android.os.Parcelable
import com.example.ecommerceapp.data.model.UserModel
import kotlinx.parcelize.Parcelize
import java.io.Serializable


data class ReviewModel(
    val reviewUserId: UserModel,
    val reviewBody: String,
    val reviewRating: Float
)
