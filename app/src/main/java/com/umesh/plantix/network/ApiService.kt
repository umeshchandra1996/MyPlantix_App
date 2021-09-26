package com.umesh.plantix.network


import com.umesh.plantix.network.data.model.ImageListApiResponse
import com.umesh.plantix.network.data.picsum.PickSumApiResponseItem
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {

    @GET("facts.json")
    suspend fun getImageAlbums(): Response<ImageListApiResponse>


    @GET("list")
    suspend fun getPhotosList(): Response<List<PickSumApiResponseItem>>

    @GET("albums/{id}/photos")
    suspend fun getPhotos(@Path("id") id: Long): Response<List<String>>

    @GET("photos/{id}")
    suspend fun getPhotoDetail(@Path("id") id: Long): Response<String>


}