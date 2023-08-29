package com.example.data.remote.datasource

import com.example.data.remote.api.PostApi
import com.example.data.remote.response.PostListResponse
import com.example.data.util.PostApiHandler
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import javax.inject.Inject

class PostDataSourceImpl @Inject constructor(
    private val postApi: PostApi
): PostDataSource {
    override suspend fun getListData(): Flow<PostListResponse> {
        return flow {
            emit(
                PostApiHandler<PostListResponse>()
                .httpRequest { postApi.getPostList() }
                .sendRequest()
            )
        }.flowOn(Dispatchers.IO)
    }
}