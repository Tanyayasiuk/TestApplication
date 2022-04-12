package com.example.testapplication.data.model

import com.squareup.moshi.JsonClass

@JsonClass(generateAdapter = true)
data class TopHeadlinesResponse(
    val status: String,
    val totalResults: Int?,
    val articles: List<TopHeadlinesDto>,
    val code: String? = null,
    val message: String? = null
)
