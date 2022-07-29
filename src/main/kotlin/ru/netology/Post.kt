package ru.netology

import kotlin.reflect.KClass

data class Post(
    val id:Int,
    val ownerId: Int,
    val fromId: Int,
    val createdBy: Int? = null,
    val date: Int,
    val text: String,
    val replyOwnerId: Int? = null,
    val replyPostId: Int? = null,
    val friendsOnly: Boolean,
    val comments: Comments,
    val copyright: Copyright,
    val likes: Likes,
    val reposts : Reposts,
    val views: Views,
    val post_type: String,
    val signerId: Int,
    val canPin: Boolean,
    val canDelete: Boolean,
    val canEdit: Boolean,
    val isPinned: Boolean,
    val markedAsAds: Boolean,
    val isFavorite: Boolean,
    val donut: Donut,
    val postponedId: Int? = null,
    val attachments: Array<Attachment>
)

object WallService{
    var posts = emptyArray<Post>()
    private var postId: Int = 0
    private var comments = emptyArray<Comments>()

    fun add(post: Post): Post{
        var size = posts.size
        postId += post.hashCode()
        posts += post.copy(id = size + 1)
        return posts.last()
    }

    fun update(post: Post): Boolean{
        var flag = false
        for ((index, onePost) in posts.withIndex())
            if (post.id == onePost.id) {
                posts[index] = post.copy(ownerId = onePost.ownerId, date = onePost.date)
                flag = true
            }
        return flag
    }

    fun getId(index: Int) = if ((index >= 0) && (index <= posts.size)) posts[index].id else -2

    fun createComment(postId: Int, comment: Comments): Comments {
        val initSize = comments.size
        for (i in posts.indices) {
            if (getId(i) == postId) {
                comments += comment
                break
            }
        }
        val lastSize = comments.size
        if (initSize == lastSize) {
            throw PostNotFoundException("No post with id $postId")
        }
        return comments.last()
    }


}