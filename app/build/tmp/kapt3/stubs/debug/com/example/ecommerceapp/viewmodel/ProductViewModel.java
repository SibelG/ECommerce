package com.example.ecommerceapp.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u0011J\u0006\u0010\u001e\u001a\u00020\u001cJ\u0006\u0010\u001f\u001a\u00020 J\u0006\u0010!\u001a\u00020 J\u000e\u0010\"\u001a\u00020\u001c2\u0006\u0010#\u001a\u00020$J\u0006\u0010%\u001a\u00020 J\u0006\u0010\u001a\u001a\u00020 J\u000e\u0010&\u001a\u00020\u001c2\u0006\u0010\'\u001a\u00020\u0011R\u001d\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u001d\u0010\r\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000e0\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00110\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\fR\u001d\u0010\u0016\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00140\t0\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\fR\u0017\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00190\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\f\u00a8\u0006("}, d2 = {"Lcom/example/ecommerceapp/viewmodel/ProductViewModel;", "Landroidx/lifecycle/ViewModel;", "productRepository", "Lcom/example/ecommerceapp/repository/ProductRepository;", "dbRepository", "Lcom/example/ecommerceapp/di/DBRepository;", "(Lcom/example/ecommerceapp/repository/ProductRepository;Lcom/example/ecommerceapp/di/DBRepository;)V", "brandsData", "Landroidx/lifecycle/MutableLiveData;", "", "Lcom/example/ecommerceapp/data/model/BrandModel;", "getBrandsData", "()Landroidx/lifecycle/MutableLiveData;", "categoriesData", "Lcom/example/ecommerceapp/data/model/CategoriesModel;", "getCategoriesData", "favData", "Lcom/example/ecommerceapp/data/model/FavouriteModel;", "getFavData", "productsData", "Lcom/example/ecommerceapp/data/model/ProductModel;", "getProductsData", "recommendedData", "getRecommendedData", "userData", "Lcom/example/ecommerceapp/data/model/UserModel;", "getUserData", "deleteFavourite", "", "Favourite", "getAllFavourites", "getBrands", "Lkotlinx/coroutines/Job;", "getCategories", "getIsFavourites", "id", "", "getProducts", "insertFavourite", "favourite", "app_debug"})
public final class ProductViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.ecommerceapp.repository.ProductRepository productRepository = null;
    private com.example.ecommerceapp.di.DBRepository dbRepository;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.ecommerceapp.data.model.CategoriesModel>> categoriesData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.ecommerceapp.data.model.ProductModel>> productsData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.ecommerceapp.data.model.BrandModel>> brandsData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.ecommerceapp.data.model.ProductModel>> recommendedData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<com.example.ecommerceapp.data.model.UserModel> userData = null;
    @org.jetbrains.annotations.NotNull()
    private final androidx.lifecycle.MutableLiveData<java.util.List<com.example.ecommerceapp.data.model.FavouriteModel>> favData = null;
    
    public ProductViewModel(@org.jetbrains.annotations.NotNull()
    com.example.ecommerceapp.repository.ProductRepository productRepository, @org.jetbrains.annotations.NotNull()
    com.example.ecommerceapp.di.DBRepository dbRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.example.ecommerceapp.data.model.CategoriesModel>> getCategoriesData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.example.ecommerceapp.data.model.ProductModel>> getProductsData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.example.ecommerceapp.data.model.BrandModel>> getBrandsData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.example.ecommerceapp.data.model.ProductModel>> getRecommendedData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<com.example.ecommerceapp.data.model.UserModel> getUserData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.MutableLiveData<java.util.List<com.example.ecommerceapp.data.model.FavouriteModel>> getFavData() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getCategories() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getProducts() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getBrands() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final kotlinx.coroutines.Job getUserData() {
        return null;
    }
    
    public final void insertFavourite(@org.jetbrains.annotations.NotNull()
    com.example.ecommerceapp.data.model.FavouriteModel favourite) {
    }
    
    public final void deleteFavourite(@org.jetbrains.annotations.NotNull()
    com.example.ecommerceapp.data.model.FavouriteModel Favourite) {
    }
    
    public final void getAllFavourites() {
    }
    
    public final void getIsFavourites(int id) {
    }
}