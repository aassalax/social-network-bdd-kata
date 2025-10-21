package model

data class User(val name: String, val timeline: Messages = mutableListOf()){

    fun publish(message: Message) {
        timeline.add(message)
    }
}
