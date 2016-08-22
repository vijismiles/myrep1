Feature: Application validation

  Scenario Outline: Validate Test connection and run aggregation
    Given I get the <row>
    Given I am on the home Page
    And I navigate to Application page
    And I search for application
    And I submit a req with entitlements
    And I fill the form

    Examples: 
      | row |
      |   1 |
      |   2 |
      |   3 |
