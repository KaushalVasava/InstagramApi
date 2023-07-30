package com.kaushalvasava.apis.instagramapi.data

import com.kaushalvasava.apis.instagramapi.models.Notification
import com.kaushalvasava.apis.instagramapi.models.Post
import com.kaushalvasava.apis.instagramapi.models.Story
import com.kaushalvasava.apis.instagramapi.models.User
import java.util.*
import kotlin.random.Random

object DataUtil {
    private const val MY_USER_ID = "12340"
    fun getUser(): List<User> {
        return listOf(
            User(
                id = MY_USER_ID,
                name = "Kaushal",
                profileImage = Images.User.urls[0],
                bio = "Android developer | Nature Lover",
                links = listOf("https://github.com//KaushalVasava"),
                followerIds = listOf("12341", "12342", "12343", "12344", "12345", "12346", "12347"),
                followingIds = listOf("12342", "12345", "12344", "12346", "12347"),
                postIds = listOf(
                    "123451",
                    "123452",
                    "123453",
                    "123454",
                    "123455",
                ),
                storyIds = listOf("1234561", "1234562", "1234563", "1234564", "1234565"),
            ),
            User(
                id = "12341",
                name = "Kashish",
                profileImage = Images.User.urls[1],
                bio = "Engineering student",
                links = emptyList(),
                followerIds = listOf("12343", "12344", "12345"),
                followingIds = listOf("12342", "12344"),
                postIds = listOf("123456", "123457", "123458", "123459", "1234510"),
                storyIds = listOf("1234566", "1234567", "1234568"),
            ),
            User(
                id = "12342",
                name = "Jigar",
                profileImage = Images.User.urls[2],
                bio = "IOS Developer",
                links = listOf("https://github.com//KaushalVasava"),
                followerIds = listOf(MY_USER_ID, "12345"),
                followingIds = listOf(MY_USER_ID, "12344", "12345"),
                postIds = listOf("1234511", "1234512", "1234513", "1234514"),
                storyIds = listOf("1234569", "12345610", "12345611", "12345612", "12345613"),
            ),
            User(
                id = "12343",
                name = "Sachin",
                profileImage = Images.User.urls[3],
                bio = "Lawyer | Artist",
                links = emptyList(),
                followerIds = listOf("12343", "12344"),
                followingIds = listOf("12343"),
                postIds = listOf("123451", "1234516", "1234517"),
                storyIds = listOf("12345614", "12345615", "12345616"),
            ),
            User(
                id = "12344",
                name = "Neha",
                profileImage = Images.User.urls[4],
                bio = "Clothes maker",
                links = emptyList(),
                followerIds = listOf("12343", MY_USER_ID),
                followingIds = listOf(MY_USER_ID, "12345"),
                postIds = listOf("1234518", "1234519", "1234520"),
                storyIds = listOf("12345617", "12345618"),
            ),
            User(
                id = "12345",
                name = "Vijay",
                profileImage = Images.User.urls[5],
                bio = "Traveller",
                links = emptyList(),
                followerIds = listOf("12343", MY_USER_ID, "12344"),
                followingIds = listOf(MY_USER_ID, "12343", "12344"),
                postIds = emptyList(),
                storyIds = listOf("12345619", "12345620"),
            ),
            User(
                id = "12346",
                name = "John",
                profileImage = Images.User.urls[6],
                bio = "Traveller",
                links = emptyList(),
                followerIds = listOf("12343", "12344"),
                followingIds = listOf(MY_USER_ID, "12343", "12344"),
                postIds = emptyList(),
                storyIds = emptyList(),
            ),
            User(
                id = "12347",
                name = "Android",
                profileImage = Images.User.urls[7],
                bio = "Android",
                links = emptyList(),
                followerIds = listOf("12343", MY_USER_ID, "12345"),
                followingIds = listOf(MY_USER_ID, "12343", "12344"),
                postIds = emptyList(),
                storyIds = emptyList(),
            ),
        )
    }

    fun getPosts(): List<Post> {
        val posts = mutableListOf<Post>()
        for (i in 1..20) {
            if (i <= 5) {
                posts.add(
                    Post(
                        id = "12345$i",
                        userId = "12340",
                        postImage = Images.Post.urls.random(),
                        caption = "I'm so happy, I build app using Jetpack compose $i, You can build complex ui with less code and you make it fun using animations",
                        likeCount = Random.nextInt(0, 100)
                    )
                )
            } else if (i in 6..10) {
                posts.add(
                    Post(
                        id = "12345$i",
                        userId = "12341",
                        postImage = Images.Post.urls.random(),
                        caption = "New app features $i",
                        likeCount = Random.nextInt(0, 100)
                    )
                )
            } else if (i in 11..14) {
                posts.add(
                    Post(
                        id = "12345$i",
                        userId = "12342",
                        postImage = Images.Post.urls.random(),
                        caption = "Android app $i",
                        likeCount = Random.nextInt(0, 100)
                    )
                )
            } else if (i in 15..17) {
                posts.add(
                    Post(
                        id = "12345$i",
                        userId = "12343",
                        postImage = Images.Post.urls.random(),
                        caption = "New android UI development kit $i",
                        likeCount = Random.nextInt(0, 100)
                    )
                )
            } else {
                posts.add(
                    Post(
                        id = "12345$i",
                        userId = "12344",
                        postImage = Images.Post.urls.random(),
                        caption = "Rest Api using Kotlin $i",
                        likeCount = Random.nextInt(0, 100)
                    )
                )
            }
        }
        return posts
    }

    fun getStories(): List<Story> {
        val stories = mutableListOf<Story>()
        for (i in 1..20) {
            if (i <= 5) {
                stories.add(
                    Story(
                        id = "123456$i",
                        userId = "12340",
                        image = Images.Story.urls.random(),
                        name = "Nature $i",
                        likeCount = Random.nextInt(0, 100)
                    )
                )
            } else if (i in 6..8) {
                stories.add(
                    Story(
                        id = "123456$i",
                        userId = "12341",
                        image = Images.Story.urls.random(),
                        name = "Car $i",
                        likeCount = Random.nextInt(0, 100)
                    )
                )
            } else if (i in 9..13) {
                stories.add(
                    Story(
                        id = "123456$i",
                        userId = "12342",
                        image = Images.Story.urls.random(),
                        name = "Anime $i",
                        likeCount = Random.nextInt(0, 100)
                    )
                )
            } else if (i in 14..16) {
                stories.add(
                    Story(
                        id = "123456$i",
                        userId = "12343",
                        image = Images.Story.urls.random(),
                        name = "Shopping $i",
                        likeCount = Random.nextInt(0, 100)
                    )
                )
            } else if (i in 17..18) {
                stories.add(
                    Story(
                        id = "123456$i",
                        userId = "12344",
                        image = Images.Story.urls.random(),
                        name = "Travelling $i",
                        likeCount = Random.nextInt(0, 100)
                    )
                )
            } else {
                stories.add(
                    Story(
                        id = "123456$i",
                        userId = "12345",
                        image = Images.Story.urls.random(),
                        name = "Apps $i",
                        likeCount = Random.nextInt(0, 100)
                    )
                )
            }
        }
        return stories
    }

    fun getNotifications(): List<Notification> {
        val notifications = mutableListOf<Notification>()
        for (i in 0..20) {
            notifications.add(
                Notification(
                    id = UUID.randomUUID().toString(),
                    image = Images.Post.urls.random(),
                    title = "Your post$i liked by Test user$i",
                    timeDate = System.currentTimeMillis(),
                    actionBy = "${25 * i} likes"
                )
            )
        }
        return notifications
    }
}