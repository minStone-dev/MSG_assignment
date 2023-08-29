package com.example.data.remote.response

import com.example.domain.entity.PostListEntity
import com.google.gson.annotations.SerializedName


data class PostListResponse(
    @SerializedName("userId")
    val userId: Int,
    @SerializedName("id")
    val id: Int,
    @SerializedName("title")
    val title: String,
    @SerializedName("body")
    val body: String
)
