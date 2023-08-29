package com.example.domain.usecase
import com.example.domain.PostRepository.PostRepository
import javax.inject.Inject

class GetPostListUseCase @Inject constructor(
    private val listRepository: PostRepository
) {
    suspend fun getPostList() = listRepository.getList()
}