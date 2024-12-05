@sanity
Feature: checking the OrangeHRM Myinfo 


  Background: 
  Given i login into the OrangeHRM site
  Then i enter the usrename and password
  Then i click on the login button


  Scenario: checking the OrangeHRM Myinfo 
    Given i click on the Myinfo leftpanel tab
    Then i click on the 

  @tag2
  Scenario Outline: Title of your scenario outline
    Given I want to write a step with <name>
    When I check for the <value> in step
    Then I verify the <status> in step

    Examples: 
      | name  | value | status  |
      | name1 |     5 | success |
      | name2 |     7 | Fail    |
