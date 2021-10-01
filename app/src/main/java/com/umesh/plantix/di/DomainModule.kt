package com.umesh.plantix.di

import com.umesh.plantix.albumlist.data.repository.ImageListRepository
import com.umesh.plantix.albumlist.domain.usecase.ImageListUseCase
import com.umesh.plantix.albumlist.domain.usecase.ImageListUseCaseImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object DomainModule {
    @Provides
    @Singleton
    fun provideImageListUseCase(imageListRepository: ImageListRepository) =
        ImageListUseCaseImpl(imageListRepository) as ImageListUseCase

}