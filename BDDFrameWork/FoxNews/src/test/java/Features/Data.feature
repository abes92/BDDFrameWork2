Feature: Fox News testing sign in page

  @Regression
  Scenario Outline:fox news 1
    Given I am in FoxNews homepage
    Then  I click en log in
    And I enter "<email>" and "<password>"
    Then  i wil try to login
    Examples:
    |email     |password|
    |matoub@gmail.com|1234test|
  @Regression
  Scenario:fox news2
    Given I am in FoxNews homepage
    Then  I click en log in
    And I click on create an account
    And I file the form given
    |buotam@hotmail.fr|123abES|abes|taieb|
  @SmokeTest
  Scenario:fox news3
    Given I am in FoxNews homepage
    Then  I click en log in
    And I click on create an account
    And I file the form given
      |email           |password|FN  |LN   |
      |buotam@hotmail.fr|123abES|abes|taieb|


  @abes
  Scenario:fox news functionality 4
    Given I am in FoxNews homepage
    Then  I click en log in
    And I pass details
      |email     |password|
      |matoub@gmail.com|1234test|
#      |buotam@hotmail.fr|1234te |
#      |boboahmado@gmail.bobo|5436lrt|
  @abes
  Scenario:fox news functionality 5
    Given I am in FoxNews homepage
    Then  I click en log in
    And I try to log In
    |matoub@hotmail.fr|hdr4352fd|
    Then I click log
    Then I click on forget password
    And i try to resend the password
  @abes
  Scenario:fox news functionality 6
    Given I am in FoxNews homepage
    And I click on tv1
    Then i click on coronavirus
  @abes
  Scenario:fox news functionality 7
    Given I am in FoxNews homepage
    Then I click more
    And I click politics








