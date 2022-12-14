// Generated by view binder compiler. Do not edit!
package com.example.ecommerceapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.ecommerceapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentAddressBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final RecyclerView addressRecycler;

  @NonNull
  public final Button newAddressButton;

  private FragmentAddressBinding(@NonNull ConstraintLayout rootView,
      @NonNull RecyclerView addressRecycler, @NonNull Button newAddressButton) {
    this.rootView = rootView;
    this.addressRecycler = addressRecycler;
    this.newAddressButton = newAddressButton;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentAddressBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentAddressBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_address, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentAddressBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.addressRecycler;
      RecyclerView addressRecycler = ViewBindings.findChildViewById(rootView, id);
      if (addressRecycler == null) {
        break missingId;
      }

      id = R.id.new_address_button;
      Button newAddressButton = ViewBindings.findChildViewById(rootView, id);
      if (newAddressButton == null) {
        break missingId;
      }

      return new FragmentAddressBinding((ConstraintLayout) rootView, addressRecycler,
          newAddressButton);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
