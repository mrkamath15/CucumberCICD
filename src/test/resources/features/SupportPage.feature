Feature: Support page functionality

  @smoke
  Scenario: Support is under construction
    Given user navigates to "https://demo.guru99.com/test/newtours/index.php"
    When user clicks on support link
    Then under construction page is displayed