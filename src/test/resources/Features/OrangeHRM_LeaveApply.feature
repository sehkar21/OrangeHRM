
@reg
Feature: Apply Leave in OrangeHRM 
 
   Background: 
  Given i login into the OrangeHRM site
  Then i enter the usrename and password
  Then i click on the login button

  
  Scenario: Apply Leave in OrangeHRM 
   Given user clicks on the Leave in the left panel
   Then user clicks on the Apply tab
   Then user selects the leave dates
   Then user saves the leave 
   
  Scenario: Searches for Vacancies in the OrangeHRM 
  	Given user clicks on the Recruitment Leftpanel
  	Then user clicks on the vacancies tab
  	Then user cliks on the jobtitle vacancies
  	Then uses clicks on the search button