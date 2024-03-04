package com.example.gof

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.gof.builder_object.OmletFood
import com.example.gof.builder_object.OmletFood2

class MainActivity : AppCompatActivity() {

    private lateinit var omlet: OmletFood
    private lateinit var omlet2: OmletFood2

    @SuppressLint("MissingInflatedId", "UseCompatLoadingForDrawables", "ResourceAsColor")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        omlet = OmletFood.OmletBuilder()
            .setOmletName("Amoo Teymoor omlet")
            .setSlatAmount(3.0)
            .setMeetSteakAmount(1000.0)
            .setSeasoningAmount(70.0)
            .setPizzaCheeseAmount(100.0)
            .create()

        omlet2 = OmletFood2.OmletBuilder()
            .setOmletName("Amoo Teymoor omlet")
            .setSlatAmount(3.0)
            .setMeetSteakAmount(1000.0)
            .setSeasoningAmount(70.0)
            .setPizzaCheeseAmount(100.0)
            .create()

    }
}