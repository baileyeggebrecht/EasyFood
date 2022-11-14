package com.example.easyfood.retrofit

import android.telecom.Call
import com.example.easyfood.pojo.MealList
import retrofit2.http.GET

interface MealApi {

    @GET("random.php")
    fun getRandomMeal(): retrofit2.Call<MealList>

}