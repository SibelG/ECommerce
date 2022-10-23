package com.example.ecommerceapp.data.model

import android.os.Parcelable
import androidx.room.TypeConverters
import com.example.ecommerceapp.data.model.Converters.AddressTypeConverters
import com.example.ecommerceapp.data.model.Converters.CardTypeConverters
import java.io.Serializable

data class UserModel(
    val userId: String,
    val userName: String,
    val userEmail: String,
    val userImage: Int,
    @TypeConverters(CardTypeConverters::class)
    val userCards: List<CardModel>?=null,
    @TypeConverters(AddressTypeConverters::class)
    val userAddressModel: List<AddressModel>?=null
) : Serializable