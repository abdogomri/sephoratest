package com.test.sephoratest.productslist_feature.data.remote

import com.google.gson.annotations.SerializedName


data class Product (

    @SerializedName("product_id"       ) var productId      : Int?       = null,
    @SerializedName("product_name"     ) var productName    : String?    = null,
    @SerializedName("description"      ) var description    : String?    = null,
    @SerializedName("price"            ) var price          : Int?       = null,
    @SerializedName("images_url"       ) var imagesUrl      : ImagesUrl? = ImagesUrl(),
    @SerializedName("c_brand"          ) var cBrand         : CBrand?    = CBrand(),
    @SerializedName("is_productSet"    ) var isProductSet   : Boolean?   = null,
    @SerializedName("is_special_brand" ) var isSpecialBrand : Boolean?   = null

)