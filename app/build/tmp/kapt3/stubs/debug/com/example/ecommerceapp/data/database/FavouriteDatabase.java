package com.example.ecommerceapp.data.database;

import java.lang.System;

@androidx.room.Database(entities = {com.example.ecommerceapp.data.model.FavouriteModel.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0005"}, d2 = {"Lcom/example/ecommerceapp/data/database/FavouriteDatabase;", "Landroidx/room/RoomDatabase;", "()V", "getFavouriteDao", "Lcom/example/ecommerceapp/data/database/FavouriteDao;", "app_debug"})
public abstract class FavouriteDatabase extends androidx.room.RoomDatabase {
    
    public FavouriteDatabase() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.ecommerceapp.data.database.FavouriteDao getFavouriteDao();
}