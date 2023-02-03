package com.test.sephoratest.productslist_feature.presentattion

import com.test.sephoratest.productslist_feature.data.remote.Product

data class ProductsListUiState(
    val isError: Boolean = false,
    val errorMessage: String = "",
    val isLoading: Boolean = false,
    val isEmpty: Boolean = false,
    val emptyMessage: String = "",
    val products: List<Product?> = emptyList(),
)
