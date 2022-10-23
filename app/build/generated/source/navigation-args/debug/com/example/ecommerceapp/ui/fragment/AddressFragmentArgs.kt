package com.example.ecommerceapp.ui.fragment

import android.os.Bundle
import android.os.Parcelable
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import com.example.ecommerceapp.`data`.model.UserModel
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class AddressFragmentArgs(
  public val userAddress: UserModel
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(UserModel::class.java)) {
      result.putParcelable("userAddress", this.userAddress as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(UserModel::class.java)) {
      result.putSerializable("userAddress", this.userAddress as Serializable)
    } else {
      throw UnsupportedOperationException(UserModel::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    if (Parcelable::class.java.isAssignableFrom(UserModel::class.java)) {
      result.set("userAddress", this.userAddress as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(UserModel::class.java)) {
      result.set("userAddress", this.userAddress as Serializable)
    } else {
      throw UnsupportedOperationException(UserModel::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  public companion object {
    @JvmStatic
    @Suppress("DEPRECATION")
    public fun fromBundle(bundle: Bundle): AddressFragmentArgs {
      bundle.setClassLoader(AddressFragmentArgs::class.java.classLoader)
      val __userAddress : UserModel?
      if (bundle.containsKey("userAddress")) {
        if (Parcelable::class.java.isAssignableFrom(UserModel::class.java) ||
            Serializable::class.java.isAssignableFrom(UserModel::class.java)) {
          __userAddress = bundle.get("userAddress") as UserModel?
        } else {
          throw UnsupportedOperationException(UserModel::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__userAddress == null) {
          throw IllegalArgumentException("Argument \"userAddress\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"userAddress\" is missing and does not have an android:defaultValue")
      }
      return AddressFragmentArgs(__userAddress)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): AddressFragmentArgs {
      val __userAddress : UserModel?
      if (savedStateHandle.contains("userAddress")) {
        if (Parcelable::class.java.isAssignableFrom(UserModel::class.java) ||
            Serializable::class.java.isAssignableFrom(UserModel::class.java)) {
          __userAddress = savedStateHandle.get<UserModel?>("userAddress")
        } else {
          throw UnsupportedOperationException(UserModel::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__userAddress == null) {
          throw IllegalArgumentException("Argument \"userAddress\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"userAddress\" is missing and does not have an android:defaultValue")
      }
      return AddressFragmentArgs(__userAddress)
    }
  }
}
