Feature: Login functionality
Scenario : Successful login with valid credential
 Given I launch the browser
 When I open the login page
 And I enter valid UserName and password
 And I click on login button
 Then I should be navigated to the home page
