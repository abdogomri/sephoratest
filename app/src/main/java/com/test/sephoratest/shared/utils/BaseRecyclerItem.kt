package com.test.sephoratest.shared.utils

import androidx.annotation.LayoutRes

interface BaseRecyclerItem {
    @get:LayoutRes
    val layoutId: Int
    val viewType: Int
        get() = 0
}