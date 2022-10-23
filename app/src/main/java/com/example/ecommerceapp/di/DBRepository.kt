package com.example.ecommerceapp.di

import androidx.lifecycle.LiveData
import com.example.ecommerceapp.data.database.FavouriteDatabase
import com.example.ecommerceapp.data.model.FavouriteModel
import javax.inject.Inject

class DBRepository @Inject constructor(val appDatabase: FavouriteDatabase) {

    suspend fun insertFavourite(favourite: FavouriteModel) {
        return appDatabase.getFavouriteDao().saveFavourite(favourite)

    }

    suspend fun delete(favourite: FavouriteModel) {
        appDatabase.getFavouriteDao().removeFavouriteFromFavorites(favourite)
    }

    fun getAllFavourites(): LiveData<List<FavouriteModel>> {
        return appDatabase.getFavouriteDao().getAllFavoriteFavourites()
    }
    fun searchDatabase(searchQuery: String): LiveData<FavouriteModel?> {
        return appDatabase.getFavouriteDao().getSpecificFavoriteFavouriteLiveData(searchQuery)
    }

    fun isFavourite(id:Int): Int {
        return appDatabase.getFavouriteDao().isFavorite(id)
    }




}