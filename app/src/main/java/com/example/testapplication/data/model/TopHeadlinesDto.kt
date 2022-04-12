package com.example.testapplication.data.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TopHeadlinesDto(
    val source: SourceDto,
    val author: String?,
    val title: String,
    val description: String,
    val url: String,
    val urlToImage: String,
    val publishedAt: String,
    val content: String?,
) {
    data class SourceDto(
        val id: String?,
        val name: String
    )
}
