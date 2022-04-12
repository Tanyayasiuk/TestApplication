package com.example.testapplication.domain.repository

import com.example.testapplication.data.network.NewsApi
import javax.inject.Inject

interface NewsRepository {
    suspend fun getTopHeadlines(query: String)
}

class NewsRepositoryImpl @Inject constructor(
    private val newsApi: NewsApi
) : NewsRepository {

    override suspend fun getTopHeadlines(query: String) {
        // There might be some caching logic so that already fetched articles can be
        // pre-populated straight away. And then new ones get fetched from the service,
        // cached and returned to the user
        newsApi.getTopHeadlines(query)
    }
}