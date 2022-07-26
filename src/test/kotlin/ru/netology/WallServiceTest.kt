package ru.netology

import org.junit.Test

import org.junit.Assert.*

class WallServiceTest {
    val post1: Post = Post(
        id = 0,
        owner_id = 0,
        from_id = 0,
        created_by = 0,
        date = 0,
        text = "pup",
        reply_owner_id = 0,
        reply_post_id = 0,
        friends_only = false,
        comments = Comments(count = 1, can_post = true, groups_can_post = false, can_close = false, can_open = false),
        copyright = Copyright(id = 1, link = "aa", name = "pop", type = "a"),
        likes = Likes(count = 1, user_likes = true, can_like = true, can_publish = false),
        reposts = Reposts(count = 1, user_reposted = false),
        views = Views(count = 1),
        post_type = "qw",
        signer_id = 0,
        can_pin = false,
        can_delete = false,
        can_edit = false,
        is_pinned = false,
        marked_as_ads = false,
        is_favorite = false,
        donut = Donut(is_donut = false, paid_duration = 1,can_publish_free_copy = false, edit_mode = "qwe"),
        postponed_id = 1
    )
    val post2: Post = Post(
        id = 2,
        owner_id = 0,
        from_id = 0,
        created_by = 0,
        date = 0,
        text = "pup",
        reply_owner_id = 0,
        reply_post_id = 0,
        friends_only = false,
        comments = Comments(count = 1, can_post = true, groups_can_post = false, can_close = false, can_open = false),
        copyright = Copyright(id = 1, link = "aa", name = "pop", type = "a"),
        likes = Likes(count = 1, user_likes = true, can_like = true, can_publish = false),
        reposts = Reposts(count = 1, user_reposted = false),
        views = Views(count = 1),
        post_type = "qw",
        signer_id = 0,
        can_pin = false,
        can_delete = false,
        can_edit = false,
        is_pinned = false,
        marked_as_ads = false,
        is_favorite = false,
        donut = Donut(is_donut = false, paid_duration = 1,can_publish_free_copy = false, edit_mode = "qwe"),
        postponed_id = 1
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