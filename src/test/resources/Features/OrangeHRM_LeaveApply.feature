
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
  	
  Scenario Outline: Adding employee in the PIM leftpanel
  	Given user clicks on the PIM leftpanel
  	Then user clicks on the AddEmployee tab
  	Then user enter the "<firstname>" "<middlename>" "<lastname>" and "<EmployeeID>"
  	And user adds the profile picture
  	Then user clicks on the save button
  	
  	Examples: 
  	|firstname|middlename|lastname|EmployeeID|
  	|mary     |albert    |raino   |1234      |
  	
  	@new
  	Scenario: Adding project details in the Time Leftpanel
  	Given user clicks on the Time Left panel
  	Then user clicks on the projectinfo tab and project menu
  	Then user clicks on the add button
  	Then user enter the details 
  	Then user clicks on the button in the project info tab
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	
  	