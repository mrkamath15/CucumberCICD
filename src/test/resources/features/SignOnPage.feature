Feature: Sign-On page login functionality

  Scenario: Verify login with blank credentials
    Given user navigates to "https://demo.guru99.com/test/newtours/index.php"
    When user clicks on sign-on link
    And user enters username ""
    And user enters password ""
    And user clicks on submit button
    Then user login is successful

  Scenario: Verify login with blank username
    Given user navigates to "https://demo.guru99.com/test/newtours/index.php"
    When user clicks on sign-on link
    And user enters username ""
    And user enters password "qfrghrwe"
    And user clicks on submit button
    Then login error message "Enter your userName and password correct" is displayed

  Scenario: Verify login with blank password
    Given user navigates to "https://demo.guru99.com/test/newtours/index.php"
    When user clicks on sign-on link
    And user enters username "dfdgfhtj"
    And user enters password ""
    And user clicks on submit button
    Then login error message "Enter your userName and password correct" is displayed

  Scenario: Verify login with invalid credentials
    Given user navigates to "https://demo.guru99.com/test/newtours/index.php"
    When user clicks on sign-on link
    And user enters username "dfdgfhtj"
    And user enters password "wrwrwrwr"
    And user clicks on submit button
    Then login error message "Enter your userName and password correct" is displayed