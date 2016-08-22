Feature: Title of your feature
  I want to use this template for my feature file

  Scenario Outline: Title of your scenario
    Given I get the <"row_index">
    Given I want to write a step with precondition
    And some other precondition
    When I complete action
    And some other action
    And yet another action
    Then I validate the outcomes
    And check more outcomes

    Examples: 
      |row_index|
      |         1 |
      |         2 |
      |         3 |
