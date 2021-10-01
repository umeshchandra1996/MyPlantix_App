package com.umesh.plantix.albumlist.domain.usecase
import com.umesh.plantix.albumlist.data.model.ImageListApiResponse
import com.umesh.plantix.albumlist.data.model.picsum.PickSumApiResponseItem
import com.umesh.plantix.albumlist.data.repository.ImageListRepository
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