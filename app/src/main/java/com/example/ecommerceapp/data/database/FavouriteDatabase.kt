package com.example.ecommerceapp.data.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.ecommerceapp.data.model.FavouriteModel


@Database(entities = [FavouriteModel::class], version = 1, exportSchema = false)
abstract class FavouriteDatabase: RoomDatabase() {

    abstract fun getFavouriteDao(): FavouriteDao
}