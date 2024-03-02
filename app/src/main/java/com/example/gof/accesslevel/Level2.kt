package com.example.gof.accesslevel

import com.example.gof.stock.StockMonitor
import com.example.gof.stock.StockMonitorImpl2

class Level2 : AccessLevel {
    override val stockMonitor: StockMonitor
        get() = StockMonitorImpl2()
}