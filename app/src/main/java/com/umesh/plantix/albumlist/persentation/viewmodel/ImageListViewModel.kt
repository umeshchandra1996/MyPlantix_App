package com.umesh.plantix.albumlist.persentation.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.umesh.plantix.albumlist.data.model.ImageListApiResponse
import com.umesh.plantix.albumlist.data.model.picsum.PickSumApiResponseItem
import com.umesh.plantix.resource.Resource
import com.umesh.plantix.albumlist.domain.usecase.ImageListUseCase
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch
import retrofit2.Response
import javax.inject.Inject

@HiltViewModel
class ImageListViewModel @Inject constructor(private var useCase: ImageListUseCase):ViewModel(){
    private val _getImageListDataStatus = MutableStateFlow<Resource <Response<ImageListApiResponse>>>(Resource.loading(null))

    val getImageListDataStatus: StateFlow<Resource<Response<ImageListApiResponse>>> = _getImageListDataStatus

    private val _getImageListPickSumDataStatus = MutableStateFlow<Resource <Response<List<PickSumApiResponseItem>>>>(Resource.loading(null))

    val getImageListPickSumDataStatus: StateFlow<Resource<Response<List<PickSumApiResponseItem>>>> = _getImageListPickSumDataStatus

    suspend fun getImageList() {
        viewModelScope.launch {
            _getImageListDataStatus.value=(Resource.loading(null))
            try {
                val data = useCase.getImageList()
                _getImageListDataStatus.value=(Resource.success(data, 0))
            } catch (exception: Exception) {
                _getImageListDataStatus.value=(Resource.error(null, exception.message!!))
            }
        }
    }

    suspend fun getImageListPickSum() {
        viewModelScope.launch {
            _getImageListDataStatus.value=(Resource.loading(null))
            try {
                val data = useCase.getImageListPicSum()
                _getImageListPickSumDataStatus.value=(Resource.success(data, 0))
            } catch (exception: Exception) {
                _getImageListDataStatus.value=(Resource.error(null, exception.message!!))
            }
        }
    }

}