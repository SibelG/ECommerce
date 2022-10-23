package com.example.ecommerceapp.ui.fragment

import android.os.Bundle
import android.os.Parcelable
import androidx.navigation.ActionOnlyNavDirections
import androidx.navigation.NavDirections
import com.example.ecommerceapp.R
import com.example.ecommerceapp.`data`.model.UserModel
import java.io.Serializable
import java.lang.UnsupportedOperationException
import kotlin.Int
import kotlin.Suppress

public class AccountFragmentDirections private constructor() {
  private data class ActionAccountFragmentToCardsFragment(
    public val userCard: UserModel
  ) : NavDirections {
    public override val actionId: Int = R.id.action_accountFragment_to_cardsFragment

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
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
  }

  private data class ActionAccountFragmentToAddressFragment(
    public val userAddress: UserModel
  ) : NavDirections {
    public override val actionId: Int = R.id.action_accountFragment_to_addressFragment

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
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
  }

  private data class ActionAccountFragmentToUpdateProfileFragment(
    public val userDetails: UserModel
  ) : NavDirections {
    public override val actionId: Int = R.id.action_accountFragment_to_updateProfileFragment

    public override val arguments: Bundle
      @Suppress("CAST_NEVER_SUCCEEDS")
      get() {
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
  }

  public companion object {
    public fun actionAccountFragmentToCardsFragment(userCard: UserModel): NavDirections =
        ActionAccountFragmentToCardsFragment(userCard)

    public fun actionAccountFragmentToAddressFragment(userAddress: UserModel): NavDirections =
        ActionAccountFragmentToAddressFragment(userAddress)

    public fun actionAccountFragmentToLoginFragment(): NavDirections =
        ActionOnlyNavDirections(R.id.action_accountFragment_to_loginFragment)

    public fun actionAccountFragmentToUpdateProfileFragment(userDetails: UserModel): NavDirections =
        ActionAccountFragmentToUpdateProfileFragment(userDetails)
  }
}
