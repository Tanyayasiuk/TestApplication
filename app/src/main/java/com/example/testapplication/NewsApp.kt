package com.example.testapplication

import android.app.Application
import android.content.Context
import com.example.testapplication.di.AppComponent
import com.example.testapplication.di.DaggerAppComponent

class NewsApp: Application() {

    lateinit var appComponent: AppComponent
        private set

    override fun onCreate() {
        super.onCreate()
        appComponent = DaggerAppComponent.builder()
            .application(this)
            .build()
    }
}

val Context.appComponent: AppComponent
    get() = when (this) {
        is NewsApp -> appComponent
        else -> (applicationContext as NewsApp).appComponent
    }