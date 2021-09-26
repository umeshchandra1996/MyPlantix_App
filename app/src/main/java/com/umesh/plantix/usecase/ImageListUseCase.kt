package com.umesh.plantix.usecase

import com.umesh.plantix.network.data.model.ImageListApiResponse
import com.umesh.plantix.network.data.picsum.PickSumApiResponseItem
import retrofit2.Response


interface ImageListUseCase {
 suspend fun getImageList(): Response<ImageListApiResponse>
 suspend fun getImageListPicSum(): Response<List<PickSumApiResponseItem>>
}