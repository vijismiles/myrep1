Feature: Application validation

  Scenario Outline: Validate Test connection and run aggregation
    Given I get the <row>
    Given I am on the home Page
    And I navigate to Application page
    And I search for application
    Then I click on application and open the application
    And I click on Configuration
    Then i click on Test connection
    Then I validate Test Connection
    Then I run aggregation task
    Then I validate aggregation task result

    Examples: 
      | row |
      |1|
      |2|
      |3|
