Feature: Search

Scenario: Search Autocomplete
  Given I open page "home"
  When I click on input "search"
  And I Enter text "may tinh" to input "search"
  Then I wait for 2 sec
  And I have element a "autocomplete_first" have partial text as "may tinh"

Scenario: Search Result
  Given I open page "home"
  When I click on input "search"
  And I Enter text "may tinh" to input "search"
  And  I click on button "search"
  Then I wait for 3 sec
  And I have some any Product result search
  |135390256|
  |105155309|
  |136138552|
  |169643853|

Scenario: Search not found result
  Given I open page "home"
  When I click on input "search"
  And I Enter text "dfsdfsdg" to input "search"
  And  I click on button "search"
  Then I wait for 3 sec
  And Search Not Result

Scenario: History Search
  Given I open page "home"
  When I click on input "search"
  And I Enter text "mobile" to input "search"
  And I click on button "search"
  And I wait for 3 sec
  And I click on input "search"
  And I clear input "search"
  Then I have element a "history_first" show message as "mobile"


Scenario: Clear History Search
  Given I open page "home"
  When I click on input "search"
  And I Enter text "mobile" to input "search"
  And I click on button "search"
  And I wait for 3 sec
  And I click on input "search"
  And I clear input "search"
  And I click on button "clear_history"
  Then Check element having container "history" should not be present

