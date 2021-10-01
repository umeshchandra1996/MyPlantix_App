package com.umesh.plantix.albumlist.data.repository

import com.umesh.plantix.albumlist.data.model.ImageListApiResponse
import com.umesh.plantix.albumlist.data.model.picsum.PickSumApiResponseItem
import retrofit2.Response

interface ImageListRepository {
    suspend fun getImageList(): Response<ImageListApiResponse>
    suspend fun getImageListPicSum(): Response<List<PickSumApiResponseItem>>
}