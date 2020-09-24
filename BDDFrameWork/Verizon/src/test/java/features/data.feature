Feature: verizon functionality 2
   Scenario: verizon test 16
     Given I am on verizon home page
     Then I click on sign in
  Scenario: verizon test 17
    Given I am on verizon home page
    Then I click on sign in
    And I verify sign in appears properly
  Scenario Outline: verizon test 18
    Given I am on verizon home page
    Then I click on sign in
    And I verify sign in appears properly
    Then I send "<ID>" and "<password>"
    Examples:
    |ID|password|
    |abes |123Test|
  Scenario: verizon test 19
    Given I am on verizon home page
    Then I click on sign in
    Then I click register
  Scenario: verizon test 20
    Given I am on verizon home page
    Then I click on sign in
    Then I click register
    Then i click on continue
  Scenario: verizon test 21
    Given I am on verizon home page
    Then I click on sign in
    Then i click on i forgot my info
  Scenario: verizon test 22
    Given I am on verizon home page
    Then I click on sign in
    Then i click on make one time payment
  Scenario: verizon test 23
    Given I am on verizon home page
    Then I click on sign in
    Then i click on i forgot my info
    And i try to log in
    |9173452334|
    Then i click on continue1
     Scenario: verizon test 24
       Given I am on verizon home page
       Then i click on make one time payment
       Then I click on sign in
       Then i click on continue2
       And   i click on wirless then i file the rest
       |347|657|645|11204|
       Then i click log1

       Scenario: verizon test 25
         Given I am on verizon home page
         Then I click on sign in
         Then i click on make one time payment
         Then I click on in home
         Then i click on continue2