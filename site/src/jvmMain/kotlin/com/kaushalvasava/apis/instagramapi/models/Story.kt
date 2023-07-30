package com.kaushalvasava.apis.instagramapi.models

import kotlinx.serialization.Serializable

@Serializable
data class Story(
    val id: String,
    val userId: String,
    val name: String? = null,
    val image: String,
    val likeCount: Int = 0
)
