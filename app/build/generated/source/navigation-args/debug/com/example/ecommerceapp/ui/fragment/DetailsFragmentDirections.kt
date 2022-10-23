package com.example.ecommerceapp.ui.fragment

import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.ecommerceapp.R

public class DetailsFragmentDirections private constructor() {
  public companion object {
    public fun actionDetailsFragmentToWriteReviewFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_detailsFragment_to_writeReviewFragment)

    public fun actionDetailsFragmentToLoginFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_detailsFragment_to_loginFragment)
  }
}
