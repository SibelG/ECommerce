// Generated by view binder compiler. Do not edit!
package com.example.ecommerceapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.ecommerceapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ItemCategoryBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final CardView cardImage;

  @NonNull
  public final ImageView itemImage;

  @NonNull
  public final AppCompatTextView itemText;

  private ItemCategoryBinding(@NonNull ConstraintLayout rootView, @NonNull CardView cardImage,
      @NonNull ImageView itemImage, @NonNull AppCompatTextView itemText) {
    this.rootView = rootView;
    this.cardImage = cardImage;
    this.itemImage = itemImage;
    this.itemText = itemText;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ItemCategoryBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ItemCategoryBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.item_category, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ItemCategoryBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.card_image;
      CardView cardImage = ViewBindings.findChildViewById(rootView, id);
      if (cardImage == null) {
        break missingId;
      }

      id = R.id.item_image;
      ImageView itemImage = ViewBindings.findChildViewById(rootView, id);
      if (itemImage == null) {
        break missingId;
      }

      id = R.id.item_text;
      AppCompatTextView itemText = ViewBindings.findChildViewById(rootView, id);
      if (itemText == null) {
        break missingId;
      }

      return new ItemCategoryBinding((ConstraintLayout) rootView, cardImage, itemImage, itemText);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
