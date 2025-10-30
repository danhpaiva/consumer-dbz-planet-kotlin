package com.example.consumerdbzplanet.models

data class Planet(
    val id: Int,
    val name: String,
    val isDestroyed: Boolean,
    val description: String,
    val image: String,
    val deletedAt: String? // Pode ser nulo, por isso usamos 'String?'
)
