package com.example.ecommerceapp.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


data class CardModel(
    val cardNumber: Long,
    val cardHolderName: String,
    val cardExpiryDate: String,
    val cardType: CardTypeEnum,
)
