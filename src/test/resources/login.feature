Feature: Login
Scenario: Customer logs in to the website
    Given I am on the login page
    When I check page title
    When I enter username only
    When I click on Login button1
    When I check for error message
    When I enter wrong password
    When I click on Login button2
    When I check for alert
    When I enter correct details
    When I click on Login Button3
    Then I expect to go to next page