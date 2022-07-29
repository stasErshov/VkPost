package ru.netology

fun main(){
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
        attachments = arrayOf(LinkAttachment(Link(url="1", title = "asd", caption = "qwe", description = "qwe")))
    )
    WallService.add(post1)
    WallService.add(post2)
    WallService.createComment(2, Comments(count = 1, canPost = true, groupsCanPost = false, canClose = false, canOpen = false))
    WallService.update(post1)
    println(WallService.update(post2))

}
class PostNotFoundException(message: String) : RuntimeException(message)