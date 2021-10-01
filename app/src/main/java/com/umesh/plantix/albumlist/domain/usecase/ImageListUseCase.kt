package com.umesh.plantix.albumlist.domain.usecase

import com.umesh.plantix.albumlist.data.model.ImageListApiResponse
import com.umesh.plantix.albumlist.data.model.picsum.PickSumApiResponseItem
import retrofit2.Response


interface ImageListUseCase {
 suspend fun getImageList(): Response<ImageListApiResponse>
 suspend fun getImageListPicSum(): Response<List<PickSumApiResponseItem>>
}