Feature: jet blue home page functionality
#scenario #1
  Scenario: jet blue test1
    Given I am on jet blue home page
    Then I click on book
  #scenario #2
  Scenario: jet blue test2
    Given I am on jet blue home page
    Then I click on travel info
    #scenario #3
  Scenario: jet blue test3
    Given I am on jet blue home page
    Then I click on my trip
      #scenario #4
  Scenario: jet blue test4
    Given I am on jet blue home page
    Then I click on trueBlue
        #scenario #5
  Scenario Outline: jet blue test5
    Given I am on jet blue home page
    Then I click sign in
    Then I verify sign in appears properly
    And I send "<email>" and "<password>"
    Then I click log in
    Examples:
    |email|password|
    |Matoub@gmail.com|01251956|
           #scenario #6
  Scenario: jet blue test6
    Given I am on jet blue home page
    Then I click sign in
    Then I verify sign in appears properly
    And I try to log in
    |Matoub@gmail.com|01251956|
           #scenario #7
  Scenario: jet blue test7
    Given I am on jet blue home page
    Then I click on travel bank credit
          #scenario #8
  Scenario: jet blue test8
    Given I am on jet blue home page
    Then I click on check in
           #scenario #9
  Scenario: jet blue test9
    Given I am on jet blue home page
    Then I click on flight tracker
            #scenario #10
  Scenario: jet blue test10
    Given I am on jet blue home page
    Then I click on travel alerts
           #scenario #11
  Scenario: jet blue test11
    Given I am on jet blue home page
    Then I click join
             #scenario #12
  Scenario: jet blue test12
    Given I am on jet blue home page
    Then I click join
    And I send variables
    |matoub@gmail.com|
    Then I click sign in1
               #scenario #13
  Scenario: jet blue test13
    Given I am on jet blue home page
    Then I click join
    And I send variables
      |matoub@gmail.com|
    Then I click sign in1
    And i file the rest
    |David|bobo|di|
    Then I click sign in2
                 #scenario #14
  Scenario: jet blue test14
    Given I am on jet blue home page
    Then I click join
    And I send variables
      |matoub@gmail.com|
    Then I click sign in1
                    #scenario #15
  Scenario: jet blue test15
    Given I am on jet blue home page
    Then I click on round trip
    And I send locations
    |new york|chicago|
                      #scenario #16
  Scenario: jet blue test16
    Given I am on jet blue home page
    Then I click on book with out change or cancel
                        #scenario #17
  Scenario: jet blue test17
    Given I am on jet blue home page
    Then I click on book with out change or cancel
    And  i click on weather disruption

                        #scenario #18
  Scenario: jet blue test18
    Given I am on jet blue home page
    Then I click on book with out change or cancel
    And  i click on weather disruption
    Then I click on fee weather button then link
    And I verify weather fee appears properly
                          #scenario #19
  Scenario: jet blue test19
    Given I am on jet blue home page
    Then I click on book with out change or cancel
    And I click on cancelled
                          #scenario #20
  Scenario: jet blue test20
    Given I am on jet blue home page
    Then I click on book with out change or cancel
    And I click on changed flight
                              #scenario #21
  Scenario: jet blue test21
    Given I am on jet blue home page
    Then I click on book with out change or cancel
    And I click on voluntary
                              #scenario #22
  Scenario: jet blue test22
    Given I am on jet blue home page
    Then I click on book with out change or cancel
    And I click on other important information
      #scenario #23
  Scenario: jet blue test23
    Given I am on jet blue home page
    Then I click on my trip
    And I click on Manage trip
    Then I verify manage trip appears properly
    #scenario #24
  Scenario: jet blue test24
    Given I am on jet blue home page
    Then I click on travel info
    And I click on wifi