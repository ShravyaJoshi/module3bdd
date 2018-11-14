#Author: asdfghj
Feature: HotelBooking

Scenario: Successful hotel booking with all valid data
Given    User is on hotel booking page
When    user enters all valid details
Then    navigate to welcome page

Scenario: Failure in hotel booking    
Given    User is on hotel booking page
When    user leaves first name blank
Then    display alert message

Scenario:  Failure in hotel booking   
Given    User is on hotel booking page
When    user leaves last name blank 
Then    display alert message

Scenario:   Failure in hotel booking  
Given    User is on hotel booking page
When    user enters all data
But    user enters wrong email and click button
Then    display alert message

Scenario:  Failure in hotel booking   
Given    User is on hotel booking page
When    user leaves mobile number empty
Then    display alert message

Scenario: Failure in hotel booking
Given User is on hotel booking page
When user enters incoorect mobile format
|994980531111|
||
|123|
|456987|
Then display alert message



Scenario:   Failure in hotel booking  
Given    User is on hotel booking page
When    user leaves the city name blank
Then    display the alert message

Scenario:    Failure in hotel booking 
Given    User is on hotel booking page
When    user leaves the state name blank
Then    display the alert message

Scenario Outline: Number of guests
Given  User is on hotel booking page
When user gives guests number details <noofguests>
Then for <noofguests> no of guests allocate <noofrooms>
Examples:
|noofguests|noofrooms|
|2|1|
|6|2|
|9|3|



Scenario:    Failure in hotel booking 
Given    User is on hotel booking page
When    user leaves card holder name empty
Then    display the alert message

Scenario:    Failure in hotel booking 
Given    User is on hotel booking page
When    user leaves the debit card number blank
Then    display the alert message

Scenario:    Failure in hotel booking 
Given    User is on hotel booking page
When    user leaves the cvv blank
Then    display the alert message

Scenario:    Failure in hotel booking 
Given    User is on hotel booking page
When    user leaves the card expiration month blank
Then    display the alert message

Scenario:    Failure in hotel booking 
Given    User is on hotel booking page
When     user leaves the card expiration year blank
Then    display the alert message

Scenario:    Failure in hotel booking 
Given    User is on hotel booking page
When    user clicks on the navigation button 
Then    redirects to the success page

