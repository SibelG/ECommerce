package com.example.ecommerceapp.viewmodel;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J%\u0010\u000b\u001a\u0002H\f\"\b\b\u0000\u0010\f*\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u0002H\f0\u000fH\u0016\u00a2\u0006\u0002\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0011"}, d2 = {"Lcom/example/ecommerceapp/viewmodel/ViewModelProductProvider;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "_productRepository", "Lcom/example/ecommerceapp/repository/ProductRepository;", "_dbRepository", "Lcom/example/ecommerceapp/di/DBRepository;", "(Lcom/example/ecommerceapp/repository/ProductRepository;Lcom/example/ecommerceapp/di/DBRepository;)V", "get_dbRepository", "()Lcom/example/ecommerceapp/di/DBRepository;", "get_productRepository", "()Lcom/example/ecommerceapp/repository/ProductRepository;", "create", "T", "Landroidx/lifecycle/ViewModel;", "modelClass", "Ljava/lang/Class;", "(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;", "app_debug"})
public final class ViewModelProductProvider implements androidx.lifecycle.ViewModelProvider.Factory {
    @org.jetbrains.annotations.NotNull()
    private final com.example.ecommerceapp.repository.ProductRepository _productRepository = null;
    @org.jetbrains.annotations.NotNull()
    private final com.example.ecommerceapp.di.DBRepository _dbRepository = null;
    
    public ViewModelProductProvider(@org.jetbrains.annotations.NotNull()
    com.example.ecommerceapp.repository.ProductRepository _productRepository, @org.jetbrains.annotations.NotNull()
    com.example.ecommerceapp.di.DBRepository _dbRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.ecommerceapp.repository.ProductRepository get_productRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.ecommerceapp.di.DBRepository get_dbRepository() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public <T extends androidx.lifecycle.ViewModel>T create(@org.jetbrains.annotations.NotNull()
    java.lang.Class<T> modelClass) {
        return null;
    }
}