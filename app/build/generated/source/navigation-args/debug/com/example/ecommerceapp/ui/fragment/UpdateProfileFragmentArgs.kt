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

public data class UpdateProfileFragmentArgs(
  public val userDetails: UserModel
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(UserModel::class.java)) {
      result.putParcelable("userDetails", this.userDetails as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(UserModel::class.java)) {
      result.putSerializable("userDetails", this.userDetails as Serializable)
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
      result.set("userDetails", this.userDetails as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(UserModel::class.java)) {
      result.set("userDetails", this.userDetails as Serializable)
    } else {
      throw UnsupportedOperationException(UserModel::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  public companion object {
    @JvmStatic
    @Suppress("DEPRECATION")
    public fun fromBundle(bundle: Bundle): UpdateProfileFragmentArgs {
      bundle.setClassLoader(UpdateProfileFragmentArgs::class.java.classLoader)
      val __userDetails : UserModel?
      if (bundle.containsKey("userDetails")) {
        if (Parcelable::class.java.isAssignableFrom(UserModel::class.java) ||
            Serializable::class.java.isAssignableFrom(UserModel::class.java)) {
          __userDetails = bundle.get("userDetails") as UserModel?
        } else {
          throw UnsupportedOperationException(UserModel::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__userDetails == null) {
          throw IllegalArgumentException("Argument \"userDetails\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"userDetails\" is missing and does not have an android:defaultValue")
      }
      return UpdateProfileFragmentArgs(__userDetails)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): UpdateProfileFragmentArgs {
      val __userDetails : UserModel?
      if (savedStateHandle.contains("userDetails")) {
        if (Parcelable::class.java.isAssignableFrom(UserModel::class.java) ||
            Serializable::class.java.isAssignableFrom(UserModel::class.java)) {
          __userDetails = savedStateHandle.get<UserModel?>("userDetails")
        } else {
          throw UnsupportedOperationException(UserModel::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__userDetails == null) {
          throw IllegalArgumentException("Argument \"userDetails\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"userDetails\" is missing and does not have an android:defaultValue")
      }
      return UpdateProfileFragmentArgs(__userDetails)
    }
  }
}
