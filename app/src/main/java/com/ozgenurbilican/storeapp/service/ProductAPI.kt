package com.ozgenurbilican.storeapp.service

import com.ozgenurbilican.storeapp.model.Product
import retrofit2.http.GET
import retrofit2.Call
interface ProductAPI {
    @GET("products")
    fun getProducts(): Call<List<Product>>
}