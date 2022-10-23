// Generated by view binder compiler. Do not edit!
package com.example.ecommerceapp.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.ecommerceapp.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class FragmentSignupBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final EditText editTextTextEmailAddress;

  @NonNull
  public final EditText editTextTextName;

  @NonNull
  public final EditText editTextTextPassword;

  @NonNull
  public final TextView emailTextView;

  @NonNull
  public final TextView forgetPassTextView;

  @NonNull
  public final Guideline guidelineEnd;

  @NonNull
  public final Guideline guidelineStart;

  @NonNull
  public final TextView nameTextView;

  @NonNull
  public final TextView passTextView;

  @NonNull
  public final CardView signinCard;

  @NonNull
  public final TextView signupTextView;

  private FragmentSignupBinding(@NonNull ConstraintLayout rootView,
      @NonNull EditText editTextTextEmailAddress, @NonNull EditText editTextTextName,
      @NonNull EditText editTextTextPassword, @NonNull TextView emailTextView,
      @NonNull TextView forgetPassTextView, @NonNull Guideline guidelineEnd,
      @NonNull Guideline guidelineStart, @NonNull TextView nameTextView,
      @NonNull TextView passTextView, @NonNull CardView signinCard,
      @NonNull TextView signupTextView) {
    this.rootView = rootView;
    this.editTextTextEmailAddress = editTextTextEmailAddress;
    this.editTextTextName = editTextTextName;
    this.editTextTextPassword = editTextTextPassword;
    this.emailTextView = emailTextView;
    this.forgetPassTextView = forgetPassTextView;
    this.guidelineEnd = guidelineEnd;
    this.guidelineStart = guidelineStart;
    this.nameTextView = nameTextView;
    this.passTextView = passTextView;
    this.signinCard = signinCard;
    this.signupTextView = signupTextView;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static FragmentSignupBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static FragmentSignupBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.fragment_signup, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static FragmentSignupBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.editTextTextEmailAddress;
      EditText editTextTextEmailAddress = ViewBindings.findChildViewById(rootView, id);
      if (editTextTextEmailAddress == null) {
        break missingId;
      }

      id = R.id.editTextTextName;
      EditText editTextTextName = ViewBindings.findChildViewById(rootView, id);
      if (editTextTextName == null) {
        break missingId;
      }

      id = R.id.editTextTextPassword;
      EditText editTextTextPassword = ViewBindings.findChildViewById(rootView, id);
      if (editTextTextPassword == null) {
        break missingId;
      }

      id = R.id.emailTextView;
      TextView emailTextView = ViewBindings.findChildViewById(rootView, id);
      if (emailTextView == null) {
        break missingId;
      }

      id = R.id.forgetPassTextView;
      TextView forgetPassTextView = ViewBindings.findChildViewById(rootView, id);
      if (forgetPassTextView == null) {
        break missingId;
      }

      id = R.id.guidelineEnd;
      Guideline guidelineEnd = ViewBindings.findChildViewById(rootView, id);
      if (guidelineEnd == null) {
        break missingId;
      }

      id = R.id.guidelineStart;
      Guideline guidelineStart = ViewBindings.findChildViewById(rootView, id);
      if (guidelineStart == null) {
        break missingId;
      }

      id = R.id.nameTextView;
      TextView nameTextView = ViewBindings.findChildViewById(rootView, id);
      if (nameTextView == null) {
        break missingId;
      }

      id = R.id.passTextView;
      TextView passTextView = ViewBindings.findChildViewById(rootView, id);
      if (passTextView == null) {
        break missingId;
      }

      id = R.id.signinCard;
      CardView signinCard = ViewBindings.findChildViewById(rootView, id);
      if (signinCard == null) {
        break missingId;
      }

      id = R.id.signupTextView;
      TextView signupTextView = ViewBindings.findChildViewById(rootView, id);
      if (signupTextView == null) {
        break missingId;
      }

      return new FragmentSignupBinding((ConstraintLayout) rootView, editTextTextEmailAddress,
          editTextTextName, editTextTextPassword, emailTextView, forgetPassTextView, guidelineEnd,
          guidelineStart, nameTextView, passTextView, signinCard, signupTextView);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}