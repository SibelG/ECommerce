package com.example.ecommerceapp.ui.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.example.ecommerceapp.R
import com.example.ecommerceapp.data.model.UserModel
import com.example.ecommerceapp.databinding.FragmentProductDetailsBinding

class UpdateProfileFragment : Fragment() {

    private val TAG = "UpdateProfileFragment"

    //Binding
    private var _binding: FragmentProductDetailsBinding? = null
    private val binding get() = _binding!!

    //Sent args
    private val args: UpdateProfileFragmentArgs by navArgs()
    private lateinit var selectedUser: UserModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        selectedUser = args.userDetails

        Log.i(TAG, "onViewCreated: ${selectedUser}")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_update_profile, container, false)
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

}