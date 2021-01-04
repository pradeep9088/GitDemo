Feature: Irctc login Testing

  Scenario Outline: Login to Irctc page
    Given user is on QaClickAcademy login page
    When user click on Login link from tab
    When user enters <username> and <password>
    And clicks on login button
    Then user should be logged in successfully

    Examples: 
      | username           | password   |
      | psmaigra@gmail.com | Pradeep@20 |
