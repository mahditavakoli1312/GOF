package com.example.gof.document_creator

import com.example.gof.document.Document

interface DocumentCreator {
    fun createDocument() : Document
}