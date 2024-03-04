package com.example.gof

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.gof.custom_object.Ali
import com.example.gof.custom_object.Human

class MainActivity : AppCompatActivity() {

    private lateinit var ali: Human<Ali>
    private lateinit var reza: Human<Ali>

    @SuppressLint("MissingInflatedId", "UseCompatLoadingForDrawables", "ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        ali = Ali()
        reza = ali.clone()

    }
}