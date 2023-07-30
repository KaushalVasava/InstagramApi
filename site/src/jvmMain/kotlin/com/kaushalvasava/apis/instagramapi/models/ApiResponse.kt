package com.kaushalvasava.apis.instagramapi.models

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
sealed class ApiResponse {
    @Serializable
    @SerialName("success_user")
    data class SuccessUser(val data: List<User>) : ApiResponse()

    @Serializable
    @SerialName("success_post")
    data class SuccessPost(val data: List<Post>) : ApiResponse()

    @Serializable
    @SerialName("success_story")
    data class SuccessStory(val data: List<Story>) : ApiResponse()

    @Serializable
    @SerialName("success_notification")
    data class SuccessNotification(val data: List<Notification>) : ApiResponse()

    @Serializable
    @SerialName("error")
    data class Failed(val errorMsg: String) : ApiResponse()
}
