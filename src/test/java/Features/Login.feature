Feature: Application login

  Scenario: Home page default login
    Given User is on internet banking landing page
    When user login into application with "natia" and "1234"
    Then Home page is populated
    And Cards displayed are "true"

  Scenario: Home page default login
    Given User is on internet banking landing page
    When user login into application with "bla" and "5678"
    Then Home page is populated
    And Cards displayed are "false"


