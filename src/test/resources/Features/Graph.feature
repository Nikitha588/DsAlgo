Feature: feature to test graph functionality

  Scenario: User is able to navigate to Graph page
    Given User is on Home page
    When user clicks graph from the dropdown menu
    Then user should be redirected to Graph page
