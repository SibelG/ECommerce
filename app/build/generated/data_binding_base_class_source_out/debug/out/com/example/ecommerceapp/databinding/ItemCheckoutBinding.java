// Generated by view binder compiler. Do not edit!
package com.example.ecommerceapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.ecommerceapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemCheckoutBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final ImageButton decreaseButton;

  @NonNull
  public final ImageButton increaseButton;

  @NonNull
  public final ImageView itemCartImage;

  @NonNull
  public final TextView itemCartPrice;

  @NonNull
  public final TextView itemCartTitle;

  private ItemCheckoutBinding(@NonNull ConstraintLayout rootView,
      @NonNull ImageButton decreaseButton, @NonNull ImageButton increaseButton,
      @NonNull ImageView itemCartImage, @NonNull TextView itemCartPrice,
      @NonNull TextView itemCartTitle) {
    this.rootView = rootView;
    this.decreaseButton = decreaseButton;
    this.increaseButton = increaseButton;
    this.itemCartImage = itemCartImage;
    this.itemCartPrice = itemCartPrice;
    this.itemCartTitle = itemCartTitle;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemCheckoutBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemCheckoutBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_checkout, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemCheckoutBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.decreaseButton;
      ImageButton decreaseButton = ViewBindings.findChildViewById(rootView, id);
      if (decreaseButton == null) {
        break missingId;
      }

      id = R.id.increaseButton;
      ImageButton increaseButton = ViewBindings.findChildViewById(rootView, id);
      if (increaseButton == null) {
        break missingId;
      }

      id = R.id.itemCartImage;
      ImageView itemCartImage = ViewBindings.findChildViewById(rootView, id);
      if (itemCartImage == null) {
        break missingId;
      }

      id = R.id.itemCartPrice;
      TextView itemCartPrice = ViewBindings.findChildViewById(rootView, id);
      if (itemCartPrice == null) {
        break missingId;
      }

      id = R.id.itemCartTitle;
      TextView itemCartTitle = ViewBindings.findChildViewById(rootView, id);
      if (itemCartTitle == null) {
        break missingId;
      }

      return new ItemCheckoutBinding((ConstraintLayout) rootView, decreaseButton, increaseButton,
          itemCartImage, itemCartPrice, itemCartTitle);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
