package com.example.gof.stock

import android.content.Context
import android.view.View

interface StockMonitor {
    // monitoring
    fun getStockList(): List<String>

    // stock chart
    fun getStockChart(context: Context): View

}