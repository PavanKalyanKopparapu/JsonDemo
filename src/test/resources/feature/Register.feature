@Register
  Feature:Register scenarios of Automation Demo Site
  Scenario: User register on Automation Demo Site
    Given  User is on Register homepage
    When User fill the data
    |fill_data|
    And User clicks on submit button
    Then User should be Register Successfully



