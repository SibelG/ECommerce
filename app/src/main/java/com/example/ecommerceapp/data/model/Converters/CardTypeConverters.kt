package com.example.ecommerceapp.data.model.Converters

import androidx.room.TypeConverter
import com.example.ecommerceapp.data.model.CardModel
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class CardTypeConverters {
    @TypeConverter
    fun fromCategoryList(category: List<CardModel>):String?{
        if (category == null){
            return (null)
        }else{
            val gson = Gson()
            val type = object : TypeToken<CardModel>(){

            }.type
            return gson.toJson(category,type)
        }
    }

    @TypeConverter
    fun toCategoryList ( categoryString: String):List<CardModel>?{
        if (categoryString == null){
            return (null)
        }else{
            val gson = Gson()
            val type = object : TypeToken<CardModel>(){

            }.type
            return  gson.fromJson(categoryString,type)
        }
    }
}