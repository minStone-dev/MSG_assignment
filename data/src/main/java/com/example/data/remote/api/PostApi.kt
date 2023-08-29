package com.example.data.remote.api

import com.example.data.remote.response.PostCommentsResponse
import com.example.data.remote.response.PostDetailResponse
import com.example.data.remote.response.PostListResponse
import retrofit2.http.GET
import retrofit2.http.Path


interface PostApi {
    @GET("posts")
    suspend fun getPostList(): List<PostListResponse>

    @GET("posts/{id}")
    suspend fun getDetail(
        @Path("id") id: Int
    ): PostDetailResponse

    @GET("posts/{id}/comments")
    suspend fun getComments(
        @Path("id") id: Int
    ): List<PostCommentsResponse>
}