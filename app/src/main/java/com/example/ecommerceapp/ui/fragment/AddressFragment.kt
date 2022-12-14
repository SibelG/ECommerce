package com.example.ecommerceapp.ui.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.ecommerceapp.R
import com.example.ecommerceapp.adapter.AddressAdapter
import com.example.ecommerceapp.data.model.UserModel
import com.example.ecommerceapp.databinding.FragmentAddressBinding

class AddressFragment : Fragment(R.layout.fragment_address) {

    //Binding
    private var _binding: FragmentAddressBinding? = null
    val binding get() = _binding

    //Sent args
    private val args: AddressFragmentArgs by navArgs()
    private lateinit var selectedUserAddress: UserModel

    //Adapter
    private lateinit var addressAdapter: AddressAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentAddressBinding.inflate(inflater, container, false)
        return binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        selectedUserAddress = args.userAddress

        addressAdapter = AddressAdapter()
        addressAdapter.differ.submitList(selectedUserAddress.userAddressModel)

        binding!!.addressRecycler.apply {
            adapter = addressAdapter
            layoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
        }
    }
}