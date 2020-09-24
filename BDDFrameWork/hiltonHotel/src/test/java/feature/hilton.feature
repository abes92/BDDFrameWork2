Feature: hilton hotel home page functionality
#scenario #1
  Scenario:hilton hotel1
    Given I am on hilton hotel home page
    Then I click on sign in
    #scenario #2
  Scenario: hilton hotel 2
    Given I am on hilton hotel home page
    Then  I click on find a hotel
     #scenario #3
  Scenario: hilton hotel 3
    Given I am on hilton hotel home page
    Then  I click on find a hotel
    Then  I click on join
         #scenario #4
  Scenario: hilton hotel 4
    Given I am on hilton hotel home page
    Then  I click on find a hotel
    Then  I click on join
    And   I follow the steps
    |david|di|9178034568|matoub@hotmail.fr|380 ave p brooklyn ny|11204|123456|123456|
    Then I register for free
           #scenario #5
  Scenario: hilton hotel 5
    Given I am on hilton hotel home page
    Then  I click on find a hotel
    And   I try to find destination
             #scenario #6
  Scenario: hilton hotel 6
    Given I am on hilton hotel home page
    Then I log in
                #scenario #7
  Scenario Outline: hilton hotel 7
    Given I am on hilton hotel home page
    Then I log in
    Then I send "<username>" and "<password>"
    Examples:
    |username|password|
    |Davidos |123test |
              #scenario #8
  Scenario: hilton hotel 8
    Given I am on hilton hotel home page
    Then I click location
                 #scenario #9
  Scenario: hilton hotel 9
    Given I am on hilton hotel home page
    Then I click location
    And I click where to
                  #scenario #10
  Scenario: hilton hotel 10
    Given I am on hilton hotel home page
    Then I click on Find event
                  #scenario #11
  Scenario: hilton hotel 11
    Given I am on hilton hotel home page
    Then I click on Find event
    And I search for the event
                     #scenario #12
  Scenario: hilton hotel 12
    Given I am on hilton hotel home page
    Then I click offers
                         #scenario #13
  Scenario: hilton hotel 13
    Given I am on hilton hotel home page
    Then I click offers
    And I verify offers appears properly
                            #scenario #14
  Scenario: hilton hotel 14
    Given I am on hilton hotel home page
    Then I click offers
    And I verify offers appears properly
    Then I click find hotel
                             #scenario #15
  Scenario: hilton hotel 15
    Given I am on hilton hotel home page
    Then I click offers
    And I verify offers appears properly
    Then I choose arrival and departure time
                               #scenario #16
  Scenario: hilton hotel 16
    Given I am on hilton hotel home page
    Then I click offers
    And I verify offers appears properly
    Then I choose arrival and departure time1
                                #scenario #17
  Scenario: hilton hotel 17
    Given I am on hilton hotel home page
    Then I click offers
    And I verify offers appears properly
    Then I click find hotel
    Then  I choose room and adult
                                  #scenario #18
  Scenario: hilton hotel 18
    Given I am on hilton hotel home page
    Then I click offers
    Then I click on support
                                   #scenario #19
  Scenario: hilton hotel 19
    Given I am on hilton hotel home page
    Then I click offers
    Then I click on credit cards
                                      #scenario #20
  Scenario: hilton hotel 20
    Given I am on hilton hotel home page
    Then I click offers
    Then I click on credit cards
    Then I Verify credit cards appears properly
                                        #scenario #21
  Scenario: hilton hotel 21
    Given I am on hilton hotel home page
    Then I click offers
    Then I click on travel Inspiration
                                        #scenario #22
  Scenario: hilton hotel 22
    Given I am on hilton hotel home page
    Then I click offers
    Then I click on experiences
                                           #scenario #23
  Scenario: hilton hotel 23
    Given I am on hilton hotel home page
    Then I click offers
    Then i click on points
    And I verify points appears properly
                                             #scenario #24
  Scenario: hilton hotel 24
    Given I am on hilton hotel home page
    Then I click offers
    And I click on member benefits
