package com.test.sephoratest.shared.data

import com.test.sephoratest.productslist_feature.data.remote.Product
import com.test.sephoratest.shared.utils.Constant.ITEMS_URL
import retrofit2.http.GET

interface ApiInterface {
    @GET(ITEMS_URL)
    suspend fun getItems(): List<Product>
}