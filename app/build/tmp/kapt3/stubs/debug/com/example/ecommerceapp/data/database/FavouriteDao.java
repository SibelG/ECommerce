package com.example.ecommerceapp.data.database;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\bg\u0018\u00002\u00020\u0001J\u0011\u0010\u0002\u001a\u00020\u0003H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0004J\u0014\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006H\'J\u001b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u000bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\fJ\u0018\u0010\r\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\b0\u00062\u0006\u0010\n\u001a\u00020\u000bH\'J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000fH\'J\u0019\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\bH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0014\u001a\u00020\bH\'\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0015"}, d2 = {"Lcom/example/ecommerceapp/data/database/FavouriteDao;", "", "deleteAllFavourites", "", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getAllFavoriteFavourites", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/ecommerceapp/data/model/FavouriteModel;", "getSpecificFavoriteFavourite", "id", "", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSpecificFavoriteFavouriteLiveData", "isFavorite", "", "removeFavouriteFromFavorites", "FavouriteModel", "(Lcom/example/ecommerceapp/data/model/FavouriteModel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "saveFavourite", "ProductModel", "app_debug"})
public abstract interface FavouriteDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void saveFavourite(@org.jetbrains.annotations.NotNull()
    com.example.ecommerceapp.data.model.FavouriteModel ProductModel);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM FavouriteModel")
    public abstract androidx.lifecycle.LiveData<java.util.List<com.example.ecommerceapp.data.model.FavouriteModel>> getAllFavoriteFavourites();
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM FavouriteModel WHERE productId =:id")
    public abstract java.lang.Object getSpecificFavoriteFavourite(@org.jetbrains.annotations.NotNull()
    java.lang.String id, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super com.example.ecommerceapp.data.model.FavouriteModel> continuation);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM FavouriteModel WHERE productId =:id")
    public abstract androidx.lifecycle.LiveData<com.example.ecommerceapp.data.model.FavouriteModel> getSpecificFavoriteFavouriteLiveData(@org.jetbrains.annotations.NotNull()
    java.lang.String id);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Delete()
    public abstract java.lang.Object removeFavouriteFromFavorites(@org.jetbrains.annotations.NotNull()
    com.example.ecommerceapp.data.model.FavouriteModel FavouriteModel, @org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "DELETE FROM FavouriteModel")
    public abstract java.lang.Object deleteAllFavourites(@org.jetbrains.annotations.NotNull()
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @androidx.room.Query(value = "SELECT EXISTS (SELECT 1 FROM FavouriteModel WHERE productId=:id)")
    public abstract int isFavorite(int id);
}