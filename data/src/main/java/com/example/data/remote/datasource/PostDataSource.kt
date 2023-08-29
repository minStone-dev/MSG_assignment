package com.example.data.remote.datasource

import com.example.data.remote.response.PostListResponse
import kotlinx.coroutines.flow.Flow

interface PostDataSource {
    suspend fun getListData(): List<PostListResponse>
}