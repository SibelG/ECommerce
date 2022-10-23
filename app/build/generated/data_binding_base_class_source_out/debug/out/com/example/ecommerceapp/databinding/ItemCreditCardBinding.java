// Generated by view binder compiler. Do not edit!
package com.example.ecommerceapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.ecommerceapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemCreditCardBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final TextView cardExpiry;

  @NonNull
  public final TextView cardExpiryDate;

  @NonNull
  public final TextView cardHolder;

  @NonNull
  public final TextView cardHolderName;

  @NonNull
  public final ImageView cardIcon;

  @NonNull
  public final TextView cardNumber;

  @NonNull
  public final Guideline endGuideLine;

  @NonNull
  public final Guideline startGuideLine;

  private ItemCreditCardBinding(@NonNull ConstraintLayout rootView, @NonNull TextView cardExpiry,
      @NonNull TextView cardExpiryDate, @NonNull TextView cardHolder,
      @NonNull TextView cardHolderName, @NonNull ImageView cardIcon, @NonNull TextView cardNumber,
      @NonNull Guideline endGuideLine, @NonNull Guideline startGuideLine) {
    this.rootView = rootView;
    this.cardExpiry = cardExpiry;
    this.cardExpiryDate = cardExpiryDate;
    this.cardHolder = cardHolder;
    this.cardHolderName = cardHolderName;
    this.cardIcon = cardIcon;
    this.cardNumber = cardNumber;
    this.endGuideLine = endGuideLine;
    this.startGuideLine = startGuideLine;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemCreditCardBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemCreditCardBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_credit_card, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemCreditCardBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.cardExpiry;
      TextView cardExpiry = ViewBindings.findChildViewById(rootView, id);
      if (cardExpiry == null) {
        break missingId;
      }

      id = R.id.cardExpiryDate;
      TextView cardExpiryDate = ViewBindings.findChildViewById(rootView, id);
      if (cardExpiryDate == null) {
        break missingId;
      }

      id = R.id.cardHolder;
      TextView cardHolder = ViewBindings.findChildViewById(rootView, id);
      if (cardHolder == null) {
        break missingId;
      }

      id = R.id.cardHolderName;
      TextView cardHolderName = ViewBindings.findChildViewById(rootView, id);
      if (cardHolderName == null) {
        break missingId;
      }

      id = R.id.cardIcon;
      ImageView cardIcon = ViewBindings.findChildViewById(rootView, id);
      if (cardIcon == null) {
        break missingId;
      }

      id = R.id.cardNumber;
      TextView cardNumber = ViewBindings.findChildViewById(rootView, id);
      if (cardNumber == null) {
        break missingId;
      }

      id = R.id.endGuideLine;
      Guideline endGuideLine = ViewBindings.findChildViewById(rootView, id);
      if (endGuideLine == null) {
        break missingId;
      }

      id = R.id.startGuideLine;
      Guideline startGuideLine = ViewBindings.findChildViewById(rootView, id);
      if (startGuideLine == null) {
        break missingId;
      }

      return new ItemCreditCardBinding((ConstraintLayout) rootView, cardExpiry, cardExpiryDate,
          cardHolder, cardHolderName, cardIcon, cardNumber, endGuideLine, startGuideLine);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}