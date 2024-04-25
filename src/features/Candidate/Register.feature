@register
Feature: Register

  @Smoke
  Scenario Outline: Create an account with valid credentials
    Given User navigate to the website
    Then  User redirected to landing page
    And   User clicks on login button
    Then  User redirected to login page
    And   User clicks on signup button
    Then  User redirected to signup page
    When  User Type first name <first name>
    And   User Type last name <last name>
    And   User Type email <email address>
    And   User Type phone <phone>
    And   User Add comment <comment>
    And   User clicks on create Account button
    Then  Email sent to the User and form cleared.
#data should be dynamic
    Examples:
      | email address        | first name | last name | phone       | comment             |
      | zuknamudra@gufum.com | amar       | test      | 14842918946 | looking for vendors |

  @Smoke
  Scenario Outline: Create an account with Invalid credentials
    Given User navigate to the website
    Then  User redirected to landing page
    And   User clicks on login button
    Then  User redirected to login page
    And   User clicks on signup button
    Then  User redirected to signup page
    When  User Type first name <first name>
    And   User Type last name <last name>
    And   User Type email <email address>
    And   User Type phone <phone>
    And   User Add comment <comment>
    And   User clicks on create Account button
    Then  Error message displayed to the User
#data should be dynamic
    Examples:
      | email address         | first name | last name | phone       | comment             |
      | omarmghofel@gmail.com | amar       | test      | 14842918946 | looking for vendors |