package com.example.gof

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.gof.accesslevel.AccessLevel
import com.example.gof.accesslevel.Level2

class MainActivity : AppCompatActivity() {

    lateinit var accessLevel: AccessLevel

    @SuppressLint("MissingInflatedId", "UseCompatLoadingForDrawables", "ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        accessLevel = Level2()

        Log.d("GOF-APP", "onCreate: ${accessLevel.stockMonitor.getStockChart(this).background} ")
        Log.d("GOF-APP", "onCreate: ${accessLevel.stockMonitor.getStockList()}")
        setContentView(accessLevel.stockMonitor.getStockChart(this))
    }

}