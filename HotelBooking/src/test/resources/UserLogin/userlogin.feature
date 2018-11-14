


Feature: Login


 
  Scenario: check the heading of the login page
  
    Given user is on login page
    
    Then check the heading of the page
    
    Scenario: Successful login with valid data
    Discription: to login,user needs to enter her valid username,password
    
   Given user is on login page
   When  user enters valid username,valid password
    Then navigate to hotel page
    
    Scenario: Prompt user to enter the data when he leaves the login fields
    
     Given user is on login page
    When user doesnot enter either username or password
    And click the login Button
    Then display appropriate message
    
    Scenario: Unsuccessful login due to incorrect username or password
    Given user is on login page
    When user enters incoorect username or password
    Then display login failed message
   
    

