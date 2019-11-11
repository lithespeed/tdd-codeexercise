@hello
Feature: As a user, I want to be greeted, so that I can start my day

Scenario: Program returns Hello World
Given I want to be greeted
When I execute the application
Then I should see the default message