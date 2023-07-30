package com.kaushalvasava.apis.instagramapi.models

import kotlinx.serialization.Serializable

@Serializable
data class Message(
    val msg: String,
    val timeStamp: Long,
    val isSeen: Boolean = false,
    val userId: String,
)
