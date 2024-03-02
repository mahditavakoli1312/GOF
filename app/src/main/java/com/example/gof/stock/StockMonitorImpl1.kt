package com.example.gof.stock

import android.content.Context
import android.view.View
import android.widget.ImageView
import com.example.gof.R

class StockMonitorImpl1 : StockMonitor {

    private val stocks = listOf(
        "khodro",
        "vesapa",
        "khapa",
        "kapa",
    )

    override fun getStockList(): List<String> {
        return stocks
    }

    override fun getStockChart(context: Context): View {
        val imageView = ImageView(context)
        imageView.setBackgroundResource(R.color.gray)
        return imageView
    }
}