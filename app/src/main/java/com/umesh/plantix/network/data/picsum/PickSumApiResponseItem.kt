package com.umesh.plantix.network.data.picsum

data class PickSumApiResponseItem(
    val author: String?="",
    val download_url: String?="",
    val height: Int?=Int.MIN_VALUE,
    val id: String?="",
    val url: String?="",
    val width: Int?= Int.MIN_VALUE
)