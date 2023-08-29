package com.example.data.remote.mapper

import com.example.data.remote.response.PostListResponse
import com.example.domain.entity.PostListEntity

object PostMapper {
    fun List<PostListResponse>.toEntityList(): List<PostListEntity> {
        return map { response ->
            PostListEntity(
                userId = response.userId,
                id = response.id,
                title = response.title,
                body = response.body
            )
        }
    }
}