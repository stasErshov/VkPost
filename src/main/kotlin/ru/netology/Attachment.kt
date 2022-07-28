package ru.netology

sealed class Attachment(open val type: String)


data class PhotoAttachment(val photo: Photo) : Attachment("photo")

data class Photo(val id: Int,
                 val albumId: Int,
                 val ownerId: Int,
                 val userId: Int,
                 val text: String,
                 val date: Int,
                 val width: Int,
                 val height: Int)

data class LinkAttachment(val link: Link) : Attachment("link")

data class Link(val url: String,
                val title: String,
                val caption: String,
                val description: String,
)

data class AudioAttachment (val audio: Audio) : Attachment ("audio")

data class Audio(
    val id: Int,
    val ownerId: Int,
    val artist: String,
    val title: String,
    val duration: Int,
    val url: String,
)

data class DocumentAttachment(val document: Document) : Attachment ("document")

data class Document(
    val id: Int,
    val ownerId: Int,
    val title: String,
    val size: Int,
    val ext: String,
    val url: String,
    val date: Int,
)

data class NoteAttachment(val note: Note) : Attachment ("note")

data class Note(
    val id: Int,
    val ownerId: Int,
    val title: String,
    val text: String,
    val date: Int,
    val comments: Int,
    val viewUrl: String,
    val privacyView: Array<String>,
    val canComment: Boolean
)

