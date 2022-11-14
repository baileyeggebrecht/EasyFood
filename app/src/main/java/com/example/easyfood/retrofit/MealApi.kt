package com.example.easyfood.retrofit

import android.telecom.Call
import com.example.easyfood.pojo.MealList
import retrofit2.http.GET
import retrofit2.http.Query

interface MealApi {

    @GET("random.php")
    fun getRandomMeal(): retrofit2.Call<MealList>

    @GET("lookup.php?")
    fun getMealDetails(@Query("i") id:String) : retrofit2.Call<MealList>

}