package com.test.sephoratest.productslist_feature.presentattion

import com.test.sephoratest.productslist_feature.domain.use_case.GetProductsListUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class ProductViewModel @Inject constructor(
    private val getProductsListUseCase: GetProductsListUseCase
){
}