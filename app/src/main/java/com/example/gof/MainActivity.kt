package com.example.gof

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.gof.singleton.Singleton

class MainActivity : AppCompatActivity() {


    @SuppressLint("MissingInflatedId", "UseCompatLoadingForDrawables", "ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ApplicationData.instance()
        ApplicationData.instance()
        ApplicationData.instance()
        ApplicationData.instance()

        val singleton = Singleton.getInstance()
        singleton.setValue(12)
        Log.d("singleton", "singleton1: ${singleton}")


        val singleton2 = Singleton.getInstance()
        Log.d("singleton", "singleton1: ${singleton2}")
    }
}