package com.example.ecommerceapp.repository

import com.example.ecommerceapp.data.model.DummyData


class ProductRepository() {

    fun getCategories() = DummyData.getCategoriesData()

    fun getProducts() = DummyData.getProducts()

    fun getBrands() = DummyData.getBrands()

    fun getUser() = DummyData.getUserData()
}