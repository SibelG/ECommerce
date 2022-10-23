package com.example.ecommerceapp.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.ecommerceapp.di.DBRepository
import com.example.ecommerceapp.repository.ProductRepository


class ViewModelProductProvider(val _productRepository: ProductRepository, val _dbRepository: DBRepository) :
    ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return ProductViewModel(_productRepository,_dbRepository) as T
    }
}
