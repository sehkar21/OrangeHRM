@sanity
Feature: Login into OrangeHRM

  @sanity
  Scenario Outline: Login into OrangeHRM
    Given i launch the browser and enter into orangeHRM site
    Given user enters "<username>" and "<password>"
    And click on the login button
    Then verify the homepage

    Examples: 
      | username | password |
      | Admin    | admin123 |
      | Admin    | asfh1234 |
