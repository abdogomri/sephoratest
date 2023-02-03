package com.test.sephoratest.productslist_feature.data.remote

import com.google.gson.annotations.SerializedName

data class ImagesUrl(
    @SerializedName("small" ) var small : String? = null,
    @SerializedName("large" ) var large : String? = null
)
