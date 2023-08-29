package com.example.data.repository

import com.example.data.remote.api.PostApi
import com.example.data.remote.datasource.PostDataSource
import com.example.data.remote.response.PostListResponse
import com.example.domain.PostRepository.PostRepository
import com.example.domain.entity.PostListEntity
import com.example.domain.model.PostListModel
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.map
import java.lang.Exception
import javax.inject.Inject

class PostRepositoryImpl  @Inject constructor(
    private val postDataSource: PostDataSource
) : PostRepository {
    override suspend fun getList(): Flow<List<PostListEntity>> {}
}