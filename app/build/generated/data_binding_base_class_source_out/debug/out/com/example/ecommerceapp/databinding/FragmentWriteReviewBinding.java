// Generated by view binder compiler. Do not edit!
package com.example.ecommerceapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.ecommerceapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentWriteReviewBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final EditText reviewText;

  @NonNull
  public final Button sendReviewButton;

  @NonNull
  public final RatingBar writeReviewRatingBar;

  private FragmentWriteReviewBinding(@NonNull ConstraintLayout rootView,
      @NonNull EditText reviewText, @NonNull Button sendReviewButton,
      @NonNull RatingBar writeReviewRatingBar) {
    this.rootView = rootView;
    this.reviewText = reviewText;
    this.sendReviewButton = sendReviewButton;
    this.writeReviewRatingBar = writeReviewRatingBar;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentWriteReviewBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentWriteReviewBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_write_review, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentWriteReviewBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.reviewText;
      EditText reviewText = ViewBindings.findChildViewById(rootView, id);
      if (reviewText == null) {
        break missingId;
      }

      id = R.id.sendReviewButton;
      Button sendReviewButton = ViewBindings.findChildViewById(rootView, id);
      if (sendReviewButton == null) {
        break missingId;
      }

      id = R.id.writeReviewRatingBar;
      RatingBar writeReviewRatingBar = ViewBindings.findChildViewById(rootView, id);
      if (writeReviewRatingBar == null) {
        break missingId;
      }

      return new FragmentWriteReviewBinding((ConstraintLayout) rootView, reviewText,
          sendReviewButton, writeReviewRatingBar);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
