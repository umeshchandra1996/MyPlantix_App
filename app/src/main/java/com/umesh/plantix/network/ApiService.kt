package com.umesh.plantix.network


import com.umesh.plantix.albumlist.data.model.ImageListApiResponse
import com.umesh.plantix.albumlist.data.model.picsum.PickSumApiResponseItem
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Path

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