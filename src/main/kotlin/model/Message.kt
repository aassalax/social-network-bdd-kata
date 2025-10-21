package model

@JvmInline
value class Message(val content: String)

typealias Messages = MutableList<Message>