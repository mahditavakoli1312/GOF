package com.example.gof.document_creator.impl

import com.example.gof.document.Document
import com.example.gof.document.impl.Letter
import com.example.gof.document_creator.DocumentCreator

class LetterCreator(
    val header: String,
    val title: String,
    val text: String,
    val sign: Int
) : DocumentCreator {
    override fun createDocument(): Document {
        return Letter(
            header,
            title,
            text,
            sign
        )
    }
}