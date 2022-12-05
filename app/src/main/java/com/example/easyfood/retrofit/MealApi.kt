package com.example.easyfood.retrofit

import com.example.easyfood.pojo.CategoryList
import com.example.easyfood.pojo.MealsByCategoryList
import com.example.easyfood.pojo.MealList
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface MealApi {

    @GET("random.php")
    fun getRandomMeal(): retrofit2.Call<MealList>

    @GET("lookup.php?")
    fun getMealDetails(@Query("i") id:String) : retrofit2.Call<MealList>

    @GET("filter.php?")
    fun getPopularItems(@Query("c") categoryName: String) : retrofit2.Call<MealsByCategoryList>

    @GET("categories.php")
    fun getCategories() : Call<CategoryList>

}