Feature: Booking
Scenario: Customer goes to Booking Page
    Given I am on the booking page
    When I check the page title
    When I click confirm booking button
    When I check for alert for first name
    When I enter first name and click confirm booking
    When I check for alert for last name
    When I enter last name and click confirm booking
    When I check for alert for email
    When I enter email and click confirm booking
    When I check for alert for mobile number
    When I enter invalid mobile no and click confirm booking
    When I check for alert for contact no
    When I enter contact no and click confirm booking
    When I check alert for city
    When I select city and click confirm booking
    When I check alert for state
    When I select state and click confirm booking
    When I check alert for cardholder name
    When I enter cardholder name and click confirm booking
    When I check for alert for debit card number
    When I enter card details and click confirm booking
    When I check alert for cvv
    When I enter cvv and click confirm booking
    When I check alert for exp month
    When I enter exp month and click confirm booking
    When I check alert for exp year
    When I enter exp year and click confirm booking
    Then I should go to success page