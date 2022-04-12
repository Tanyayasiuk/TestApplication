package com.example.testapplication.data.network

import com.example.testapplication.data.model.TopHeadlinesResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

interface NewsApi {
    suspend fun getTopHeadlines(query: String): Result<TopHeadlinesResponse>
}

class NewsApiImpl @Inject constructor(
    private val service: NewsService,
) : NewsApi {

    // Fetch top headlines via service, check for error and map correspondingly
    override suspend fun getTopHeadlines(query: String): Result<TopHeadlinesResponse> =
        withContext(Dispatchers.Default) {
            val response = service.getTopHeadlines(query = query)

            return@withContext if (response.isSuccessful) {
                val responseBody =
                    requireNotNull(response.body()) {
                        "Body should not be null if the response was successful."
                    }
                // TODO: Add checks for "status" field
                Result.success(responseBody)
            } else {
                // TODO: Add error mapping
                Result.failure(Throwable())
            }
        }
}