package com.example.ecommerceapp.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.bumptech.glide.Glide.init
import com.example.ecommerceapp.data.model.*
import com.example.ecommerceapp.di.DBRepository
import com.example.ecommerceapp.repository.ProductRepository
import kotlinx.coroutines.launch

class ProductViewModel(private val productRepository: ProductRepository, private var dbRepository: DBRepository) : ViewModel() {

    val categoriesData: MutableLiveData<MutableList<CategoriesModel>> = MutableLiveData()
    val productsData: MutableLiveData<MutableList<ProductModel>> = MutableLiveData()
    val brandsData: MutableLiveData<MutableList<BrandModel>> = MutableLiveData()
    val recommendedData: MutableLiveData<MutableList<ProductModel>> = MutableLiveData()
    val userData: MutableLiveData<UserModel> = MutableLiveData()
    val favData : MutableLiveData<MutableList<FavouriteModel>> = MutableLiveData()

    init {
        getCategories()
        getProducts()
        getBrands()
        getUserData()
    }

    fun getCategories() = viewModelScope.launch {
        val result = productRepository.getCategories()
        categoriesData.postValue(result)
    }

    fun getProducts() = viewModelScope.launch {
        val result = productRepository.getProducts()
        productsData.postValue(
            result.subList(
                0,
                2
            )
        ) //Send the first 2 elements as best selling items
        recommendedData.postValue(result)
    }

    fun getBrands() = viewModelScope.launch {
        val result = productRepository.getBrands()
        brandsData.postValue(result)
    }

    fun getUserData() = viewModelScope.launch {
        val result = productRepository.getUser()
        userData.postValue(result)
    }

    fun insertFavourite(favourite: FavouriteModel) {
        viewModelScope.launch {

            dbRepository.insertFavourite(favourite)
        }
    }


    fun deleteFavourite(Favourite: FavouriteModel) {
        viewModelScope.launch {

            dbRepository.delete(Favourite)
        }
    }
    fun getAllFavourites()  {
        viewModelScope.launch {
            dbRepository.getAllFavourites()
        }
    }
    fun getIsFavourites(id:Int) {
        viewModelScope.launch {
            dbRepository.isFavourite(id)
        }
    }


    //fun getAllFavourites() = dbRepository.getAllFavourites()
}
