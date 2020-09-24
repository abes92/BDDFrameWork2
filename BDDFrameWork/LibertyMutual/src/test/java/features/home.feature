Feature: Liberty Mutual functionality
  Background:
    Given i am on home page
#scenario #1
    Scenario: liberty test1
      Then i click on auto
      #scenario #2
  Scenario: liberty test2
    Then i click on auto
    And i send zip code
    |11204|
    Then i click get my price
    #scenario #3
    Scenario: liberty test3
      Then i click on property
      #scenario #4
  Scenario: liberty test4
    Then i click on property
    And i click on home
    #scenario #5
  Scenario: liberty test5
    Then i click on property
    And i click on renters
    #scenario #6
  Scenario: liberty test6
    Then i click on property
    And i click on condo
    #scenario #7
  Scenario: liberty test7
    Then i click on property
    And i click on home
    Then  i send zip code2
    |11214|
    Then i click get my price
      #scenario #8
  Scenario: liberty test8
    Then i click on bundle
        #scenario #9
  Scenario: liberty test9
    Then i click on bundle
    Then i click on autoHome
     #scenario #10
  Scenario: liberty test10
    Then i click on bundle
    Then i click on AutoRenters
      #scenario #11
  Scenario: liberty test11
    Then i click on bundle
    Then i click on AutoCondo
     #scenario #12
  Scenario: liberty test12
    Then i click on bundle
    Then i click on autoHome
    Then i click zip code
    Then i click get my price
    #scenario #13
    Scenario: liberty test13
      Given i am on home page
      Then i click on sign in
      #scenario #14
  Scenario: liberty test14
    Given i am on home page
    Then i click on customer support
       #scenario #15
  Scenario: liberty test15
    Given i am on home page
    Then i click on claims
      #scenario #16
  Scenario: liberty test16
    Given i am on home page
    Then i click on shop insurance
       #scenario #17
  Scenario Outline: liberty test17
    Given i am on home page
    Then i click on sign in
    Then i send "<username>" and "<password>"
    And i click log in
    Examples:
    |username|password|
    |david   |123eqw |

      #scenario #18
  Scenario: liberty test18
    Given i am on home page
    Then i click on about
       #scenario #19
  Scenario: liberty test19
    Given i am on home page
    Then i click on Business
      #scenario #20
  Scenario: liberty test20
    Given i am on home page
    Then i click personal
         #scenario #21
  Scenario: liberty test21
    Then i click on property
    And i click on home
    And i click on home1
    |zipCode|
    |11214  |
    |11204  |
    |11205  |
            #scenario #22
  Scenario: liberty test22
    Then i click on property
    And i click on renters
    And i send zip codes
      |zipCode|
      |11004  |
      |11205  |
      |11223  |
             #scenario #23
  Scenario: liberty test23
    Then i click on property
    And i click on condo
    And i send zip codes too
      |zipCode|
      |11211  |
      |11201  |
      |11202  |
               #scenario #24
    Scenario: liberty test24
      Then i click on file a claims
      And i verify file claims appears properly
                    #scenario #25
         Scenario: liberty test25
           Then i click on manage claims
           And i verify manage claim appears properly
