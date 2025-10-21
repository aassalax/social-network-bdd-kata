package model

data class User(val name: String){
    val timeline = mutableListOf<String>()

    fun publish(message: String) {
        timeline.add(message)
    }
}
