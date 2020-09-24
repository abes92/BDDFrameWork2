Feature: more functionality



Scenario Outline: Fox News Functionality
  Given I am in FoxNews homepage
And I click more
Then  I click Search box
And  I send "<variables>" to search box
And  I click search
#Then  I verify "<expected>" values
  Then  I close browser

Examples:
|variables   |
|soccer news |
|daily news  |