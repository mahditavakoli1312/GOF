package com.example.gof.accesslevel

import com.example.gof.stock.StockMonitor
import com.example.gof.stock.StockMonitorImpl1

class Level1 : AccessLevel {
    override val stockMonitor: StockMonitor
        get() = StockMonitorImpl1()
}