Feature: Cucumber Spring Example

  Background: A Basic Example
    Given some number crunching

  Scenario: Multiplication
    When I multiply 4 and 5
    Then the result is 20

  Scenario: Triple Addition
    When I add 1 2 and 3
    Then the result is 6