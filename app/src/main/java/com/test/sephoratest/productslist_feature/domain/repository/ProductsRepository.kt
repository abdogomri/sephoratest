package com.test.sephoratest.productslist_feature.domain.repository

import com.test.sephoratest.productslist_feature.data.remote.Product

interface ProductsRepository {

    suspend fun getProductsList(): List<Product>
}