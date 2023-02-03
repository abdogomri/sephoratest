package com.test.sephoratest.productslist_feature.domain.use_case

import com.test.sephoratest.productslist_feature.data.remote.Product
import com.test.sephoratest.productslist_feature.domain.repository.ProductsRepository
import com.test.sephoratest.shared.utils.Resource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import retrofit2.HttpException
import java.io.IOException
import javax.inject.Inject

class GetProductsListUseCase @Inject constructor(
    private val repository: ProductsRepository
) {
    operator fun invoke(): Flow<Resource<List<Product>>> = flow {
        try {
            emit(Resource.Loading())
            val productsList = repository.getProductsList()
            emit(Resource.Success(productsList))
        } catch (e: HttpException) {
            emit(Resource.Error(e.localizedMessage ?: "An unexpected error occured"))
        } catch (e: IOException) {
            emit(Resource.Error("Couldn't reach server. Check your internet connection."))
        }
    }

}