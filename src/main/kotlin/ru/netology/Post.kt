package ru.netology

data class Post(
    val id:Int,
    val owner_id: Int,
    val from_id: Int,
    val created_by: Int,
    val date: Int,
    val text: String,
    val reply_owner_id: Int,
    val reply_post_id: Int,
    val friends_only: Boolean,
    val comments: Comments,
    val copyright: Copyright,
    val likes: Likes,
    val reposts : Reposts,
    val views: Views,
    val post_type: String,
    val signer_id: Int,
    val can_pin: Boolean,
    val can_delete: Boolean,
    val can_edit: Boolean,
    val is_pinned: Boolean,
    val marked_as_ads: Boolean,
    val is_favorite: Boolean,
    val donut: Donut,
    val postponed_id: Int
){

}

object WallService{
    var posts = emptyArray<Post>()
    private var postId: Int = 0

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
                posts[index] = post.copy(owner_id = onePost.owner_id, date = onePost.date)
                flag = true
            }
        return flag
    }

}