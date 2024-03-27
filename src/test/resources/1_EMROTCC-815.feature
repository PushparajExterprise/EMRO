@EMROTCC-816
Feature: To Validate the New Employee Profile creation

  #To Validate the New Employee Profile creation
  @TEST_EMROTCC-815
  Scenario: To Validate the New Employee Profile creation
    Given launch the browser and navigate to EMRO homepage
    When user give valid username and password
    And click login button
    And navigate to Employee profile creation page
    And create Employee profile by giving required details
      | BASKAR123 |
    And setup the Employee credentials
    And logout the application
    And login the Application with new user
    Then check whether the user navigated to the home page
