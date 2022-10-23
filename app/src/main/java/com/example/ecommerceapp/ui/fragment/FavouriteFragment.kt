package com.example.ecommerceapp.ui.fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.Observer
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.room.Database
import com.example.ecommerceapp.R
import com.example.ecommerceapp.adapter.FavouritesAdapter
import com.example.ecommerceapp.data.model.FavouriteModel
import com.example.ecommerceapp.databinding.FragmentFavouriteBinding
import com.example.ecommerceapp.viewmodel.ProductViewModel

class FavouriteFragment : Fragment(R.layout.fragment_favourite) {

    private val TAG = "ExploreFragment"

    //ViewModels
    lateinit var productsViewModel: ProductViewModel

    //Binding
    private var _binding: FragmentFavouriteBinding? = null
    private val binding get() = _binding!!

    //RecyclerView
    private lateinit var favouritesAdapter: FavouritesAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentFavouriteBinding.inflate(inflater, container, false)
        return binding.root

        initViewModel()
    }

    override fun onDestroy() {
        super.onDestroy()
        _binding = null
    }

    private fun initViewModel() {

        //init ViewModels
        productsViewModel.favData.observe(viewLifecycleOwner, Observer { resultList ->
            favouritesAdapter.differ.submitList(resultList)
        })


    }
    private fun loadFavourites(){
        favouritesAdapter = FavouritesAdapter()
        binding.favRecView.apply {
            layoutManager = LinearLayoutManager(activity, LinearLayoutManager.VERTICAL, false)
            adapter = favouritesAdapter
            hasFixedSize()
        }
        favouritesAdapter.onItemClicked {
            navigateToDetails(it)
        }

        /*val database = Database(this,null)
        favList = database.getAllFavlist()
        val adapter= FavouriteAdapter(this, favList)
        recyclerView.adapter=adapter*/
    }

    override fun onResume() {
        super.onResume()
        loadFavourites()
    }
    private fun navigateToDetails(product: FavouriteModel) {
        val bundle = Bundle()
        bundle.putParcelable("productDetails", product)
        findNavController().navigate(
            R.id.action_exploreFragment_to_detailsFragment,
            bundle
        )
    }

}