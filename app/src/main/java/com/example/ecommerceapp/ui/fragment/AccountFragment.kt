package com.example.ecommerceapp.ui.fragment

import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import com.example.ecommerceapp.R
import com.example.ecommerceapp.data.model.UserModel
import com.example.ecommerceapp.databinding.FragmentAccountBinding
import com.example.ecommerceapp.ui.activity.MainActivity
import com.example.ecommerceapp.viewmodel.ProductViewModel
import kotlinx.coroutines.launch

class AccountFragment : Fragment(R.layout.fragment_account) {

    private val TAG = "AccountFragment"

    //Binding
    private var _binding: FragmentAccountBinding? = null
    val binding get() = _binding

    //User args.
    //private val args: AccountFragmentArgs by navArgs()
    private var user: UserModel? = null

    //ViewModel
    lateinit var viewModel: ProductViewModel

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        //init ViewModel
        initViewModel()

        _binding = FragmentAccountBinding.inflate(inflater, container, false)
        return binding!!.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        Log.i(TAG, "onViewCreated: $user")

        binding?.apply {
            accountImageProfile.setImageResource(user!!.userImage)
            accountProfileName.text = user!!.userName
            accountProfileEmail.text = user!!.userEmail
            cardSection.setOnClickListener {
                val bundle = Bundle()
                bundle.putSerializable("userCard", user)
                findNavController().navigate(
                    R.id.action_accountFragment_to_cardsFragment,
                    bundle
                )
            }

            addressSection.setOnClickListener {
                val bundle = Bundle()
                bundle.putSerializable("userAddress", user)
                findNavController().navigate(
                    R.id.action_accountFragment_to_addressFragment,
                    bundle
                )
            }
            logoutSection.setOnClickListener {
                val bundle = Bundle()
                bundle.putSerializable("userAddress", user)
                findNavController().navigate(
                    R.id.action_accountFragment_to_loginFragment,
                    bundle
                )
            }
        }
    }

    private fun initViewModel() {

        viewModel = (activity as MainActivity).viewModel

        user = viewModel.userData.value
        Log.i(TAG, "initViewModel: ")
        viewModel.userData.observe(viewLifecycleOwner, Observer {
            Log.i(TAG, "getUserData: $it")
            user = it
        })
    }
}