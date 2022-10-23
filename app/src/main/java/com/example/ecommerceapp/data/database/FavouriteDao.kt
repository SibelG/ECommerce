package com.example.ecommerceapp.data.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query
import com.example.ecommerceapp.data.model.FavouriteModel


@Dao
interface FavouriteDao {

    @Insert(onConflict = REPLACE)
    fun saveFavourite(ProductModel: FavouriteModel)

    @Query("SELECT * FROM FavouriteModel")
    fun getAllFavoriteFavourites(): LiveData<List<FavouriteModel>>

    @Query("SELECT * FROM FavouriteModel WHERE productId =:id")
    suspend fun getSpecificFavoriteFavourite(id: String): FavouriteModel?

    @Query("SELECT * FROM FavouriteModel WHERE productId =:id")
    fun getSpecificFavoriteFavouriteLiveData(id: String): LiveData<FavouriteModel?>

    @Delete
    suspend fun removeFavouriteFromFavorites(FavouriteModel: FavouriteModel)

    @Query("DELETE FROM FavouriteModel")
    suspend fun deleteAllFavourites()

    @Query("SELECT EXISTS (SELECT 1 FROM FavouriteModel WHERE productId=:id)")
    fun isFavorite(id: Int): Int
}