package com.example.ecommerceapp.ui.fragment

import android.os.Bundle
import android.os.Parcelable
import androidx.lifecycle.SavedStateHandle
import androidx.navigation.NavArgs
import com.example.ecommerceapp.`data`.model.ProductModel
import java.io.Serializable
import java.lang.IllegalArgumentException
import java.lang.UnsupportedOperationException
import kotlin.Suppress
import kotlin.jvm.JvmStatic

public data class DetailsFragmentArgs(
  public val productDetails: ProductModel
) : NavArgs {
  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toBundle(): Bundle {
    val result = Bundle()
    if (Parcelable::class.java.isAssignableFrom(ProductModel::class.java)) {
      result.putParcelable("productDetails", this.productDetails as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(ProductModel::class.java)) {
      result.putSerializable("productDetails", this.productDetails as Serializable)
    } else {
      throw UnsupportedOperationException(ProductModel::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  @Suppress("CAST_NEVER_SUCCEEDS")
  public fun toSavedStateHandle(): SavedStateHandle {
    val result = SavedStateHandle()
    if (Parcelable::class.java.isAssignableFrom(ProductModel::class.java)) {
      result.set("productDetails", this.productDetails as Parcelable)
    } else if (Serializable::class.java.isAssignableFrom(ProductModel::class.java)) {
      result.set("productDetails", this.productDetails as Serializable)
    } else {
      throw UnsupportedOperationException(ProductModel::class.java.name +
          " must implement Parcelable or Serializable or must be an Enum.")
    }
    return result
  }

  public companion object {
    @JvmStatic
    @Suppress("DEPRECATION")
    public fun fromBundle(bundle: Bundle): DetailsFragmentArgs {
      bundle.setClassLoader(DetailsFragmentArgs::class.java.classLoader)
      val __productDetails : ProductModel?
      if (bundle.containsKey("productDetails")) {
        if (Parcelable::class.java.isAssignableFrom(ProductModel::class.java) ||
            Serializable::class.java.isAssignableFrom(ProductModel::class.java)) {
          __productDetails = bundle.get("productDetails") as ProductModel?
        } else {
          throw UnsupportedOperationException(ProductModel::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__productDetails == null) {
          throw IllegalArgumentException("Argument \"productDetails\" is marked as non-null but was passed a null value.")
        }
      } else {
        throw IllegalArgumentException("Required argument \"productDetails\" is missing and does not have an android:defaultValue")
      }
      return DetailsFragmentArgs(__productDetails)
    }

    @JvmStatic
    public fun fromSavedStateHandle(savedStateHandle: SavedStateHandle): DetailsFragmentArgs {
      val __productDetails : ProductModel?
      if (savedStateHandle.contains("productDetails")) {
        if (Parcelable::class.java.isAssignableFrom(ProductModel::class.java) ||
            Serializable::class.java.isAssignableFrom(ProductModel::class.java)) {
          __productDetails = savedStateHandle.get<ProductModel?>("productDetails")
        } else {
          throw UnsupportedOperationException(ProductModel::class.java.name +
              " must implement Parcelable or Serializable or must be an Enum.")
        }
        if (__productDetails == null) {
          throw IllegalArgumentException("Argument \"productDetails\" is marked as non-null but was passed a null value")
        }
      } else {
        throw IllegalArgumentException("Required argument \"productDetails\" is missing and does not have an android:defaultValue")
      }
      return DetailsFragmentArgs(__productDetails)
    }
  }
}
