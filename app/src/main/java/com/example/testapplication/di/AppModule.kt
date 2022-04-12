package com.example.testapplication.di

import com.example.testapplication.data.network.NetworkModule
import com.example.testapplication.domain.repository.NewsRepository
import com.example.testapplication.domain.repository.NewsRepositoryImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(includes = [NetworkModule::class])
object AppModule {

    @Provides
    @Singleton
    fun providesNewsRepository(impl: NewsRepositoryImpl): NewsRepository = impl

//    @Singleton
//    @Provides
//    fun provideDispatchers(): Dispatchers {
//        return Dispatchers.Default
//    }

//    @Singleton
//    @Provides
//    fun provideImageLoader(application: Application): ImageLoader {
//        return ImageLoader(application)
//    }
}