package features

import io.cucumber.java8.En
import model.Message
import model.User
import org.assertj.core.api.Assertions.assertThat

@Suppress("unused")
class PostingSteps : En {
    private lateinit var alice: User

    init {
        Given("Alice is a user of the social network") {
            alice = User("Alice")
        }
        When("Alice publishes {string}") { message : String ->
            alice.publish(Message(message))
        }
        Then("Alice's timeline should contain {string}") { expectedMessage : String ->
            assertThat(alice.timeline).containsExactly(Message(expectedMessage))
        }
        Then("Alice's timeline should contain {int} messages") { messageCounter: Int ->
            assertThat(alice.timeline).hasSize(messageCounter)
        }
    }
}