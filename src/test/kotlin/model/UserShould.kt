package model

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class UserShould {

    @Test
    fun `publish a message`() {
        val alice = User("Alice")
        val message = "Hello, this is my first post!"

        alice.publish(Message(message))

        assertThat(alice.timeline)
            .extracting<String> { it.content }
            .contains(message)
    }
}