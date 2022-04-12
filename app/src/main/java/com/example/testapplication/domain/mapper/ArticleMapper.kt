package com.example.testapplication.domain.mapper

import com.example.testapplication.data.model.TopHeadlinesDto
import com.example.testapplication.domain.model.Article

class ArticleMapper {

    fun map(dto: TopHeadlinesDto): Article {
        return Article(
            source = dto.source.toSource(),
            title = dto.title,
            url = dto.url,
            description = dto.description,
            author = dto.author,
            urlToImage = dto.urlToImage,
            publishedAt = dto.publishedAt,
            content = dto.content
        )
    }

    private fun TopHeadlinesDto.SourceDto.toSource() = Article.Source(id = id, name = name)
}