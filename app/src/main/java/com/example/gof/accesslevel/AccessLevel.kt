package com.example.gof.accesslevel

import com.example.gof.stock.StockMonitor

interface AccessLevel {
    val stockMonitor: StockMonitor
}