package com.umesh.plantix.di

import com.umesh.plantix.network.ApiService
import com.umesh.plantix.albumlist.data.repository.ImageListRepository
import com.umesh.plantix.albumlist.data.repository.ImageListRepositoryImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Singleton
    @Provides
    fun provideImageListRepository(apiService: ApiService) =
        ImageListRepositoryImpl(apiService) as ImageListRepository
}