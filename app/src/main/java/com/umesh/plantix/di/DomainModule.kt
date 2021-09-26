package com.umesh.plantix.di

import com.umesh.plantix.repository.ImageListRepository
import com.umesh.plantix.usecase.ImageListUseCase
import com.umesh.plantix.usecase.ImageListUseCaseImpl
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
    fun provideEverythingNewsUseCase(imageListRepository: ImageListRepository) =
        ImageListUseCaseImpl(imageListRepository) as ImageListUseCase

}