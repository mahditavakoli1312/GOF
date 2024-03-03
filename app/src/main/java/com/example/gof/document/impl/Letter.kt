package com.example.gof.document.impl

import com.example.gof.document.Document

class Letter(
    override val header: String, override val title: String, val text: String,
    val sign: Int
) : Document