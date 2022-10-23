package com.example.ecommerceapp.ui.fragment

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.NavDirections
import com.example.ecommerceapp.R
import com.example.ecommerceapp.`data`.model.ProductModel
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

public class ExploreFragmentDirections private constructor() {
  private data class ActionExploreFragmentToDetailsFragment(
    public val productDetails: ProductModel
  ) : NavDirections {
    public override val actionId: Int = R.id.action_exploreFragment_to_detailsFragment

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
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
  }

  public companion object {
    public fun actionExploreFragmentToDetailsFragment(productDetails: ProductModel): NavDirections =
        ActionExploreFragmentToDetailsFragment(productDetails)
  }
}
