package com.example.testapplication.data.network

import com.example.testapplication.data.model.TopHeadlinesResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsService {

    /**
     * @param query Keywords or a phrase to search for
     * @param category The category you want to get headlines for. Possible options: business
     * entertainment general health science sports technology.
     *
     * [New API Documentation](https://newsapi.org/docs/endpoints/top-headlines)
     */
    @GET("/v2/top-headlines")
    suspend fun getTopHeadlines(
        @Query("q") query: String? = null,
        @Query("category") category: String? = null,
    ): Response<TopHeadlinesResponse>
}