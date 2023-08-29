package com.example.domain.PostRepository

import com.example.domain.entity.PostListEntity
import kotlinx.coroutines.flow.Flow

interface PostRepository {
    suspend fun getList(): Flow<PostListEntity>
}