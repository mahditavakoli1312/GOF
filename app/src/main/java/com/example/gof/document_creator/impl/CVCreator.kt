package com.example.gof.document_creator.impl

import com.example.gof.document.Document
import com.example.gof.document.impl.CV
import com.example.gof.document_creator.DocumentCreator

class CVCreator(
    val header: String,
    val title: String,
    val name: String,
    val family: String,
    val age: Int,
    val education: String,
    val experience: String
) : DocumentCreator {
    override fun createDocument(): Document {
        return CV(
            header,
            title,
            name,
            family,
            age,
            education,
            experience

        )
    }
}