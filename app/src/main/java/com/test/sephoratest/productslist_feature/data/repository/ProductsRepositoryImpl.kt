package com.test.sephoratest.productslist_feature.data.repository

import com.test.sephoratest.productslist_feature.data.remote.Product
import com.test.sephoratest.productslist_feature.domain.repository.ProductsRepository
import com.test.sephoratest.shared.data.ApiInterface
import javax.inject.Inject

class ProductsRepositoryImpl @Inject constructor(
    private val api: ApiInterface
): ProductsRepository {
    override suspend fun getProductsList(): List<Product> {
        return api.getItems()
    }
}