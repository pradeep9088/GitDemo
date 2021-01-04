Feature: SpiceJet Application

  Scenario Outline: book flight in SpiceJet Application
    Given user is on landing page
    When user select from city from dropdown
    When user select To city from dropdown
    When user select depart Date
    When user select number of passenger
    When user select currency
    Then User clicks on search button
