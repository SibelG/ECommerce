package com.example.ecommerceapp.data.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize
import java.io.Serializable


data class AddressModel(
    val addressTitle: String,
    val addressBody: String,
    val addressIsChecked: Boolean = false
)
