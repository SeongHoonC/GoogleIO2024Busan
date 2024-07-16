package com.example.googleio2024.category

data class Category(
    val id: Long,
    val title: String,
    val contents: List<Content>,
)
