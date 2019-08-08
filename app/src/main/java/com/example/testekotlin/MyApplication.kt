package com.example.testekotlin

import android.app.Application
import com.example.testekotlin.util.BoxUtils

class MyApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        BoxUtils.initialize(this)
    }
}