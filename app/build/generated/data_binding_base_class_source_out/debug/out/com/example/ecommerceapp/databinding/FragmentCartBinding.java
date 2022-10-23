// Generated by view binder compiler. Do not edit!
package com.example.ecommerceapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.ecommerceapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentCartBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button checkoutButton;

  @NonNull
  public final CardView checkoutCard;

  @NonNull
  public final TextView totalPriceText;

  private FragmentCartBinding(@NonNull ConstraintLayout rootView, @NonNull Button checkoutButton,
      @NonNull CardView checkoutCard, @NonNull TextView totalPriceText) {
    this.rootView = rootView;
    this.checkoutButton = checkoutButton;
    this.checkoutCard = checkoutCard;
    this.totalPriceText = totalPriceText;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentCartBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentCartBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_cart, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentCartBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.checkoutButton;
      Button checkoutButton = ViewBindings.findChildViewById(rootView, id);
      if (checkoutButton == null) {
        break missingId;
      }

      id = R.id.checkoutCard;
      CardView checkoutCard = ViewBindings.findChildViewById(rootView, id);
      if (checkoutCard == null) {
        break missingId;
      }

      id = R.id.totalPriceText;
      TextView totalPriceText = ViewBindings.findChildViewById(rootView, id);
      if (totalPriceText == null) {
        break missingId;
      }

      return new FragmentCartBinding((ConstraintLayout) rootView, checkoutButton, checkoutCard,
          totalPriceText);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
