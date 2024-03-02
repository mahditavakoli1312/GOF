package com.example.gof.stock

import android.content.Context
import android.util.Log
import android.view.View
import android.widget.ImageView
import com.example.gof.R

class StockMonitorImpl2 : StockMonitor {

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
        imageView.setBackgroundResource(R.color.gold)
        return imageView
    }

    fun bookmarkStock(stockId: String) {
        Log.d("GOF-APP", "bookmarkStock2 :  $stockId")
    }

    fun sellStock(stockId: String) {
        Log.d("GOF-APP", "sellStock2 : $stockId")
    }

    fun buyStock(stockId: String) {
        Log.d("GOF-APP", "buyStock2 : $stockId")
    }
}