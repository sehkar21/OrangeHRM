@reg @adhoc
Feature: Apply Leave in OrangeHRM 
 
   Background: 
  Given i login into the OrangeHRM site
  Then i enter the usrename and password
  Then i click on the login button
  
  Scenario: Add new candidate in the Recruitment page
  Given user clicks on the Recruitment Leftpanel 
  Then user clicks on the plus Add button in the candidate tab
  Then user fills up the candidate data 
  Then user uploads the resume of the candidate
  Then user enters the keyword and date of application
  Then user clicks on the save button to add new candidate