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

public data class CardsFragmentArgs(
  public val userCard: UserModel
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(UserModel::class.java)) {
      result.putParcelable("userCard", this.userCard as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(UserModel::class.java)) {
      result.putSerializable("userCard", this.userCard as Serializable)
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
      result.set("userCard", this.userCard as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(UserModel::class.java)) {
      result.set("userCard", this.userCard as Serializable)
    } else {
      throw UnsupportedOperationException(UserModel::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  public companion object {
    @JvmStatic
    @Suppress("DEPRECATION")
    public fun fromBundle(bundle: Bundle): CardsFragmentArgs {
      bundle.setClassLoader(CardsFragmentArgs::class.java.classLoader)
      val __userCard : UserModel?
      if (bundle.containsKey("userCard")) {
        if (Parcelable::class.java.isAssignableFrom(UserModel::class.java) ||
            Serializable::class.java.isAssignableFrom(UserModel::class.java)) {
          __userCard = bundle.get("userCard") as UserModel?
        } else {
          throw UnsupportedOperationException(UserModel::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__userCard == null) {
          throw IllegalArgumentException("Argument \"userCard\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"userCard\" is missing and does not have an android:defaultValue")
      }
      return CardsFragmentArgs(__userCard)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): CardsFragmentArgs {
      val __userCard : UserModel?
      if (savedStateHandle.contains("userCard")) {
        if (Parcelable::class.java.isAssignableFrom(UserModel::class.java) ||
            Serializable::class.java.isAssignableFrom(UserModel::class.java)) {
          __userCard = savedStateHandle.get<UserModel?>("userCard")
        } else {
          throw UnsupportedOperationException(UserModel::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__userCard == null) {
          throw IllegalArgumentException("Argument \"userCard\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"userCard\" is missing and does not have an android:defaultValue")
      }
      return CardsFragmentArgs(__userCard)
    }
  }
}
