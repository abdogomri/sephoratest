package com.test.sephoratest.productslist_feature.data.remote

import com.google.gson.annotations.SerializedName

data class CBrand(
    @SerializedName("id"   ) var id   : String? = null,
    @SerializedName("name" ) var name : String? = null
)
