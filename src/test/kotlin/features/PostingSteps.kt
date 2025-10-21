package features

import io.cucumber.java8.En

class PostingSteps : En {
    private lateinit var alice: User

    init {
        Given("Alice is a user of the social network") {
            alice = User("Alice")
        }
        When("Alice publishes \"Hello, this is my first post!\"") {
            TODO("Not yet implemented")
        }
        Then("Alice's timeline should contain \"Hello, this is my first post!\"") {
            TODO("Not yet implemented")
        }
    }
}