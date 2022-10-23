package com.example.ecommerceapp.data.model.Converters

import androidx.room.TypeConverter
import com.example.ecommerceapp.data.model.ReviewModel
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken

class ReviewTypeConverters {

        @TypeConverter
        fun fromCategoryList(category: List<ReviewModel>):String?{
            if (category == null){
                return (null)
            }else{
                val gson = Gson()
                val type = object : TypeToken<ReviewModel>(){

                }.type
                return gson.toJson(category,type)
            }
        }

        @TypeConverter
        fun toCategoryList ( categoryString: String):List<ReviewModel>?{
            if (categoryString == null){
                return (null)
            }else{
                val gson = Gson()
                val type = object :TypeToken<ReviewModel>(){

                }.type
                return  gson.fromJson(categoryString,type)
            }
        }
    }
