package com.kaushalvasava.apis.instagramapi.data

import com.kaushalvasava.apis.instagramapi.models.Notification
import com.kaushalvasava.apis.instagramapi.models.Post
import com.kaushalvasava.apis.instagramapi.models.Story
import com.kaushalvasava.apis.instagramapi.models.User
import java.util.*
import kotlin.random.Random

object DataUtil {
    val MY_USER_ID = "12340"
    fun getUser(): List<User> {
        return listOf(
            User(
                id = MY_USER_ID,
                name = "Kaushal",
                profileImage = Images.User.urls[0],
                bio = "Android developer | Nature Lover",
                links = listOf("https://github.com//KaushalVasava"),
                followerIds = listOf("12342", "12343", "12348", "12345", "12345"),
                followingIds = listOf("12342", "12348", "12345"),
                postIds = listOf(
                    "123451",
                    "123454",
                    "123455",
                    "123457",
                    "1234512",
                    "1234511"
                ),
                storyIds = listOf("1234562", "1234565", "1234567", "1234560", "12345613"),
            ),
            User(
                id = "12341",
                name = "Kashish",
                profileImage = Images.User.urls[1],
                bio = "Engineering student",
                links = emptyList(),
                followerIds = listOf("12343", "12344", "12345"),
                followingIds = listOf("12342", "12344"),
                postIds = listOf("123452", "123453", "123454"),
                storyIds = listOf("1234561", "1234562", "1234563"),
            ),
            User(
                id = "12342",
                name = "Jigar",
                profileImage = Images.User.urls[2],
                bio = "IOS Developer",
                links = listOf("https://github.com//KaushalVasava"),
                followerIds = listOf(MY_USER_ID, "12345"),
                followingIds = listOf(MY_USER_ID, "12344", "12345"),
                postIds = listOf("123455", "123456", "123458"),
                storyIds = listOf("1234565", "1234568", "1234569", "1234564"),
            ),
            User(
                id = "12343",
                name = "Sachin",
                profileImage = Images.User.urls[3],
                bio = "Lawyer | Artist",
                links = emptyList(),
                followerIds = listOf("12343", "12344"),
                followingIds = listOf("12343"),
                postIds = listOf("123456", "123457"),
                storyIds = emptyList(),
            ),
            User(
                id = "12344",
                name = "Neha",
                profileImage = Images.User.urls[4],
                bio = "Clothes maker",
                links = emptyList(),
                followerIds = listOf("12343", "12344"),
                followingIds = listOf(MY_USER_ID, "12344"),
                postIds = listOf("123451", "123455"),
                storyIds = listOf("1234561", "1234565", "1234567", "12345612"),
            ),
            User(
                id = "12345",
                name = "Vijay",
                profileImage = Images.User.urls[1],
                bio = "Traveller",
                links = emptyList(),
                followerIds = listOf("12343", "12344"),
                followingIds = listOf(MY_USER_ID, "12343", "12344"),
                postIds = listOf("123451", "123452", "123453", "123454"),
                storyIds = emptyList(),
            ),
        )
    }

    fun getPosts(): List<Post> {
        val list = mutableListOf<Post>()
        for (i in 1..20) {
            list.add(
                Post(
                    "12345$i",
                    "1234${Random.nextInt(0, 5)}",
                    postImage = Images.Post.urls.random(),
                    caption = "I'm so happy, I build app using Jetpack compose $i",
                    likeCount = Random.nextInt(0, 100)
                )
            )
        }
        return list
    }

    fun getStories(): List<Story> {
        val stories = mutableListOf<Story>()
        for (i in 1..20) {
            stories.add(
                Story(
                    "123456$i",
                    "1234${Random.nextInt(0, 5)}",
                    Images.Story.urls.random(),
                    "something new $i",
                    Random.nextInt(0, 100)
                ),
            )
        }
        return stories
    }


    fun getNotifications(): List<Notification> {
        val list = mutableListOf<Notification>()
        for (i in 0..20) {
            list.add(
                Notification(
                    id = UUID.randomUUID().toString(),
                    image = Images.Post.urls.random(),
                    title = "Your post$i liked by Test user$i",
                    timeDate = System.currentTimeMillis(),
                    actionBy = "${25 * i} likes"
                )
            )
        }
        return list
    }
}