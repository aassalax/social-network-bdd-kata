#@wip
Feature: Posting messages
  As Alice
  I want to publish messages to my personal timeline
  So that I can share my thoughts with others

  Scenario: Alice publishes a single message to her timeline
    Given Alice is a user of the social network
    When Alice publishes "Hello, this is my first post!"
    Then Alice's timeline should contain "Hello, this is my first post!"