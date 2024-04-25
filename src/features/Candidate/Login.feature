@login
Feature: Login

@Smoke
  Scenario Outline: User logging with Invalid credentials
    Given User navigate to the website
    Then  User redirected to landing page
    And   User clicks on login button
    Then  User redirected to login page
    When  User Type username <username>
    And   User Type password <password>
    And   User clicks on submit button
    Then  Error message should be displayed to the User

    Examples:
      | username             | password    |
      | zuknamudra@gufum.com | password123 |