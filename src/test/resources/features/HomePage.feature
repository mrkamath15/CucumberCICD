Feature: Home page login functionality

  Scenario: Verify login with blank credentials
    Given user navigates to "https://demo.guru99.com/test/newtours/index.php"
    When user enters username ""
    And user enters password ""
    And user clicks on submit button
    Then user login is successful