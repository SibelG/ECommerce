package com.example.ecommerceapp.di;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u0012\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u000e0\rJ\u0019\u0010\u000f\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000bJ\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0011J\u0016\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\n0\r2\u0006\u0010\u0014\u001a\u00020\u0015R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0016"}, d2 = {"Lcom/example/ecommerceapp/di/DBRepository;", "", "appDatabase", "Lcom/example/ecommerceapp/data/database/FavouriteDatabase;", "(Lcom/example/ecommerceapp/data/database/FavouriteDatabase;)V", "getAppDatabase", "()Lcom/example/ecommerceapp/data/database/FavouriteDatabase;", "delete", "", "favourite", "Lcom/example/ecommerceapp/data/model/FavouriteModel;", "(Lcom/example/ecommerceapp/data/model/FavouriteModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllFavourites", "Landroidx/lifecycle/LiveData;", "", "insertFavourite", "isFavourite", "", "id", "searchDatabase", "searchQuery", "", "app_debug"})
public final class DBRepository {
    @org.jetbrains.annotations.NotNull()
    private final com.example.ecommerceapp.data.database.FavouriteDatabase appDatabase = null;
    
    @javax.inject.Inject()
    public DBRepository(@org.jetbrains.annotations.NotNull()
    com.example.ecommerceapp.data.database.FavouriteDatabase appDatabase) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.example.ecommerceapp.data.database.FavouriteDatabase getAppDatabase() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object insertFavourite(@org.jetbrains.annotations.NotNull()
    com.example.ecommerceapp.data.model.FavouriteModel favourite, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.lang.Object delete(@org.jetbrains.annotations.NotNull()
    com.example.ecommerceapp.data.model.FavouriteModel favourite, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<java.util.List<com.example.ecommerceapp.data.model.FavouriteModel>> getAllFavourites() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final androidx.lifecycle.LiveData<com.example.ecommerceapp.data.model.FavouriteModel> searchDatabase(@org.jetbrains.annotations.NotNull()
    java.lang.String searchQuery) {
        return null;
    }
    
    public final int isFavourite(int id) {
        return 0;
    }
}