package com.example.gof

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.gof.document_creator.DocumentCreator
import com.example.gof.document_creator.impl.CVCreator

class MainActivity : AppCompatActivity() {

    private lateinit var documentCreator: DocumentCreator

    @SuppressLint("MissingInflatedId", "UseCompatLoadingForDrawables", "ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        documentCreator = CVCreator(
            "", "", "", "", 0, "", ""
        )
    }

}