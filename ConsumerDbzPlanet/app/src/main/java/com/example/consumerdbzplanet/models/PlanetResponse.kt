package com.example.consumerdbzplanet.models

data class PlanetResponse(
    val items: List<Planet>,
    val meta: Meta,
    val links: Links
)
