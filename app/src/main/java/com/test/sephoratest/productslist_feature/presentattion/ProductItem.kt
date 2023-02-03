package com.test.sephoratest.productslist_feature.presentattion

import com.test.sephoratest.R
import com.test.sephoratest.productslist_feature.data.remote.Product
import com.test.sephoratest.shared.utils.BaseRecyclerItem

class ProductItem(
    val product: Product,
    private val onItemClick: (Product) -> Unit
): BaseRecyclerItem {
    override val layoutId: Int
        get() = R.layout.product_item

    fun onClick(product: Product) {
        onItemClick(product)
    }
}