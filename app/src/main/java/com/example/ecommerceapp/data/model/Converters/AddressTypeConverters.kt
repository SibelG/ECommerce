package com.example.ecommerceapp.data.model.Converters


import androidx.room.TypeConverter
import com.example.ecommerceapp.data.model.AddressModel
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class AddressTypeConverters {
    @TypeConverter
    fun fromCategoryList(category: List<AddressModel>):String?{
        if (category == null){
            return (null)
        }else{
            val gson = Gson()
            val type = object : TypeToken<AddressModel>(){

            }.type
            return gson.toJson(category,type)
        }
    }

    @TypeConverter
    fun toCategoryList ( categoryString: String):List<AddressModel>?{
        if (categoryString == null){
            return (null)
        }else{
            val gson = Gson()
            val type = object : TypeToken<AddressModel>(){

            }.type
            return  gson.fromJson(categoryString,type)
        }
    }
}