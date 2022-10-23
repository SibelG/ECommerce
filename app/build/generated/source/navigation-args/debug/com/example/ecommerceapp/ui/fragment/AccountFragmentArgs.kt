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

public data class AccountFragmentArgs(
  public val userData: UserModel
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(UserModel::class.java)) {
      result.putParcelable("userData", this.userData as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(UserModel::class.java)) {
      result.putSerializable("userData", this.userData as Serializable)
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
      result.set("userData", this.userData as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(UserModel::class.java)) {
      result.set("userData", this.userData as Serializable)
    } else {
      throw UnsupportedOperationException(UserModel::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  public companion object {
    @JvmStatic
    @Suppress("DEPRECATION")
    public fun fromBundle(bundle: Bundle): AccountFragmentArgs {
      bundle.setClassLoader(AccountFragmentArgs::class.java.classLoader)
      val __userData : UserModel?
      if (bundle.containsKey("userData")) {
        if (Parcelable::class.java.isAssignableFrom(UserModel::class.java) ||
            Serializable::class.java.isAssignableFrom(UserModel::class.java)) {
          __userData = bundle.get("userData") as UserModel?
        } else {
          throw UnsupportedOperationException(UserModel::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__userData == null) {
          throw IllegalArgumentException("Argument \"userData\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"userData\" is missing and does not have an android:defaultValue")
      }
      return AccountFragmentArgs(__userData)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): AccountFragmentArgs {
      val __userData : UserModel?
      if (savedStateHandle.contains("userData")) {
        if (Parcelable::class.java.isAssignableFrom(UserModel::class.java) ||
            Serializable::class.java.isAssignableFrom(UserModel::class.java)) {
          __userData = savedStateHandle.get<UserModel?>("userData")
        } else {
          throw UnsupportedOperationException(UserModel::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__userData == null) {
          throw IllegalArgumentException("Argument \"userData\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"userData\" is missing and does not have an android:defaultValue")
      }
      return AccountFragmentArgs(__userData)
    }
  }
}
