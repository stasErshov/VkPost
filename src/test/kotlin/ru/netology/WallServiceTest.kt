package ru.netology

import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {
    val post1: Post = Post(
        id = 0,
        ownerId = 0,
        fromId = 0,
        createdBy = 0,
        date = 0,
        text = "pup",
        replyOwnerId = 0,
        replyPostId = 0,
        friendsOnly = false,
        comments = Comments(count = 1, canPost = true, groupsCanPost = false, canClose = false, canOpen = false),
        copyright = Copyright(id = 1, link = "aa", name = "pop", type = "a"),
        likes = Likes(count = 1, userLikes = true, canLike = true, canPublish = false),
        reposts = Reposts(count = 1, userReposted = false),
        views = Views(count = 1),
        post_type = "qw",
        signerId = 0,
        canPin = false,
        canDelete = false,
        canEdit = false,
        isPinned = false,
        markedAsAds = false,
        isFavorite = false,
        donut = Donut(isDonut = false, paidDuration = 1,canPublishFreeCopy = false, editMode = "qwe"),
        postponedId = 1,
        attachments = emptyArray()
    )
    val post2: Post = Post(
        id = 2,
        ownerId = 0,
        fromId = 0,
        createdBy = 0,
        date = 0,
        text = "pup",
        replyOwnerId = 0,
        replyPostId = 0,
        friendsOnly = false,
        comments = Comments(count = 1, canPost = true, groupsCanPost = false, canClose = false, canOpen = false),
        copyright = Copyright(id = 1, link = "aa", name = "pop", type = "a"),
        likes = Likes(count = 1, userLikes = true, canLike = true, canPublish = false),
        reposts = Reposts(count = 1, userReposted = false),
        views = Views(count = 1),
        post_type = "qw",
        signerId = 0,
        canPin = false,
        canDelete = false,
        canEdit = false,
        isPinned = false,
        markedAsAds = false,
        isFavorite = false,
        donut = Donut(isDonut = false, paidDuration = 1,canPublishFreeCopy = false, editMode = "qwe"),
        postponedId = 1,
        attachments = emptyArray()
    )

    @Test
    fun addTest1() {
        WallService.add(post1)
        val id1 = WallService.posts.last().id
        assertEquals(1,id1)
    }
    @Test
    fun addTest2() {
        WallService.add(post2)
        val id2 = WallService.posts.last().id
        assertEquals(2,id2)
    }
    @Test
    fun updateTest1() {
        var flag: Boolean = WallService.update(post1)
        assertEquals(false, flag)
    }
    @Test
    fun updateTest2() {
        var flag: Boolean = WallService.update(post2)
        assertEquals(true, flag)
    }
}