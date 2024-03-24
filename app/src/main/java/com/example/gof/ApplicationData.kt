package com.example.gof

import android.util.Log

class ApplicationData private constructor() {


    companion object {
        private var instance: ApplicationData? = null
        var instanceCount = 0
        const val appName = "Singleton Application"
        const val appVersion = "-1.0.0"
        fun instance(): ApplicationData {
            if (instance == null) {
                instance = ApplicationData()
                instanceCount++
            }
            Log.d("GOOOF", "instance: $instanceCount")
            return instance as ApplicationData
        }
    }

}