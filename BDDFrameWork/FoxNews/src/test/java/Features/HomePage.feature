Feature: FoxNews HomePage Functionality check
 FoxNews search functionality
 FoxNews login functionality

Background:
  Given I am in FoxNews homepage
  @SmokeTest
  Scenario: FoxNews SearchBox Functionality check with valid data
    And I click on life style
    Then I verify life style is appear properly
  @Regression
    Scenario:  FoxNews SearchBox Functionality check with valid data1
     And I click on TV
      Then I verify Shows are appearing properly
  @SmokeTest
Scenario:Fox News test 3
  And I click on tv1
  Then I click on air personalities
  Then i verify on air personalities appears correctly
  @SmokeTest @Regression
  Scenario:Fox News test 4
    And I click on tv2
    Then I click on view schedule
    Then i verify schedule appears correctly
  @SmokeTest @Regression
  Scenario:Fox News test 5
    And I click on tv3
    Then I click on watch live
    Then i verify watch live appears correctly
  @SmokeTest
  Scenario:Fox News test 6
    And I scroll down to the bottom
    Then I click on full episode
    Then i verify full episode appears correctly
  @SmokeTest
  Scenario:Fox News test 7
    And I scroll down to the life style
    Then I click on Food and Drink
    Then i verify Food and Drink appears correctly
  @SmokeTest
  Scenario:Fox News test 8
    Given I click on tv8
    And I click on watch live bottom
    Then I click on fox news flush
    Then i verify fox news flash appears correctly
  @SmokeTest
  Scenario:Fox News test 9
    Given I click on tv9
    And I click on watch live bottom1
    Then I click on fox nation
    Then i verify fox nation appears correctly
  @Regression
  Scenario:Fox News test 10
    Given I click on tv9
    And I click on watch live bottom1
    Then I click on fox news radio
    Then i verify fox news radio appears correctly
  @Regression
  Scenario:Fox News test 11
    Given I click on tv9
    And I click on watch live bottom1
    Then I click on news clips
  @Regression
  Scenario:Fox News test 12
    Given I click on tv9
    And I click on watch live bottom1
    Then I click on fox business
    Then I verify fox business appears properly
  @SmokeTest @Regression
  Scenario:Fox News test 13
    Given I click on tv9
    And I click on watch live bottom1
    Then I click on login
  @Regression
  Scenario:Fox News test 14
    Given I click on tv9
    And I click on watch live bottom1
    Then I click on faceBook
  @SmokeTest @Regression
  Scenario:Fox News test 15
    Given I click on tv9
    And I click on watch live bottom1
    Then I click on twitter
  @SmokeTest
  Scenario:Fox News test 16
    Given I click on tv9
    And I click on watch live bottom1
    Then I click on twitter


