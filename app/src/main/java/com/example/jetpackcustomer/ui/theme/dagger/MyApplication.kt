package com.example.jetpackcustomer.ui.theme.dagger

import android.app.Application
import com.example.jetpackcustomer.utils.NavigationHelper
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class MyApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        NavigationHelper.initialize(this) // Initialize with an Activity context

        // Application setup code here
    }
}
