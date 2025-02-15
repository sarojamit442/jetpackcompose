package com.example.jetpackcustomer.ui.theme.dagger

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        // Application setup code here
    }
}
