package com.example.gof.document.impl

import com.example.gof.document.Document

class CV(
    override val header: String,
    override val title: String,
    val name: String,
    val family: String,
    val age: Int,
    val education: String,
    val experience: String
) : Document