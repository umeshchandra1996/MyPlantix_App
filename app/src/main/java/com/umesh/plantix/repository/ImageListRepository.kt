package com.umesh.plantix.repository

import com.umesh.plantix.network.data.model.ImageListApiResponse
import com.umesh.plantix.network.data.picsum.PickSumApiResponseItem
import retrofit2.Response

interface ImageListRepository {
    suspend fun getImageList(): Response<ImageListApiResponse>
    suspend fun getImageListPicSum(): Response<List<PickSumApiResponseItem>>
}