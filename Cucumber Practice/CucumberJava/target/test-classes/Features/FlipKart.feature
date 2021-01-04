Feature: User add Items in Flipkart

  Scenario Outline: adds the item and print the price
    Given User launch Flipkart
    When user enter <username> and <password>
    And user logged in successfully
    When user search items name in Flipkart
    And Print the price of the item
    Then user adds searched item into kart

    Examples: 
      | username   | password |
      | 8617267760 | Nov@2020 |
