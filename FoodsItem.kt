package com.example.waiter.model.db.foods


import com.google.gson.annotations.SerializedName

data class FoodsItem(
    @SerializedName("BLUDID")
    val bLUDID: Int,
    @SerializedName("NAIM")
    val nAIM: String,
    @SerializedName("PRICE")
    val pRICE: Int,
    @SerializedName("TYPE")
    val tYPE: Int
)