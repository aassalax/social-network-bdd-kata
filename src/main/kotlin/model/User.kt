package model

data class User(val name: String){
    val timeline = mutableListOf<Message>()

    fun publish(message: String) {
        timeline.add(Message(message))
    }
}
