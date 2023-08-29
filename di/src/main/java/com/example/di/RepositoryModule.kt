package com.example.di

import com.example.domain.PostRepository.PostRepository
import com.example.domain.usecase.GetPostListUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {
    @Provides
    @Singleton
    fun provideGetListUseCase(
        postRepository: PostRepository
    ): GetPostListUseCase = GetPostListUseCase(postRepository)
}