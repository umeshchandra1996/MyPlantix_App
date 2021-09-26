package com.umesh.plantix.usecase
import com.umesh.plantix.network.data.model.ImageListApiResponse
import com.umesh.plantix.network.data.picsum.PickSumApiResponseItem
import com.umesh.plantix.repository.ImageListRepository
import retrofit2.Response
import javax.inject.Inject

class ImageListUseCaseImpl @Inject constructor(private var repository: ImageListRepository ):ImageListUseCase {

    override suspend fun getImageList(): Response<ImageListApiResponse> {
        return repository.getImageList()
    }

    override suspend fun getImageListPicSum(): Response<List<PickSumApiResponseItem>> {
        return repository.getImageListPicSum()
    }
}