@sanity
Feature: checking the OrangeHRM Myinfo 


  Background: 
  Given i login into the OrangeHRM site
  Then i enter the usrename and password
  Then i click on the login button


  Scenario: checking the OrangeHRM Myinfo 
    Given i click on the Myinfo leftpanel tab
    Then i click on the profile picture
    Then i click on the plus icon and change the profile picture
    Then i save the page

 