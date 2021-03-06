package com.umesh.plantix.albumlist.data.repository

import com.umesh.plantix.network.ApiService
import com.umesh.plantix.albumlist.data.model.ImageListApiResponse
import com.umesh.plantix.albumlist.data.model.picsum.PickSumApiResponseItem
import retrofit2.Response
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class ImageListRepositoryImpl @Inject constructor(
    private var apiService: ApiService
) : ImageListRepository {

    override suspend fun getImageList(): Response<ImageListApiResponse> {
       return apiService.getImageAlbums()
    }

    override suspend fun getImageListPicSum(): Response<List<PickSumApiResponseItem>> {
        return apiService.getPhotosList()
    }
}