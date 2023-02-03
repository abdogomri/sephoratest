package com.test.sephoratest.productslist_feature.presentattion

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.test.sephoratest.productslist_feature.data.remote.Product
import com.test.sephoratest.productslist_feature.domain.use_case.GetProductsListUseCase
import com.test.sephoratest.shared.utils.BaseRecyclerItem
import com.test.sephoratest.shared.utils.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ProductViewModel @Inject constructor(
    private val getProductsListUseCase: GetProductsListUseCase
): ViewModel(){
    private var _uiState = MutableStateFlow(ProductsListUiState())
    val state: StateFlow<ProductsListUiState> = _uiState.asStateFlow()

    private val eventChannel = Channel<ProductsNavigationAction>(Channel.BUFFERED)
    val eventsFlow = eventChannel.receiveAsFlow()

    private fun getProductsList() {
        getProductsListUseCase().onEach { result ->
            when(result) {
                is Resource.Success -> result.data?.let {
                    val viewData = createProductsViewData(
                        it
                    )
                }
                is Resource.Error -> TODO()
                is Resource.Loading -> TODO()
            }
        }
    }

    private fun createProductsViewData(products: List<Product>): List<BaseRecyclerItem> {
        val viewData = mutableListOf<BaseRecyclerItem>()
        products.forEach{ product ->
        viewData.add(
            ProductItem(
                product,
                ::onProductClicked
            )
        )
        }
        return viewData
    }

    private fun onProductClicked(product: Product) {
        viewModelScope.launch {
            eventChannel.send()
        }
    }
}