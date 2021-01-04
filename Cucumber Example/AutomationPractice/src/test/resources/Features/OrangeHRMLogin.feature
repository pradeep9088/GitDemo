Feature: HRM Login validation

  Scenario Outline: Login to HRM Login
    Given user is on orange HRM application page
    When enter <username> and <password>
    When user click on login button
    Then user should be logged in succesfully

    Examples: 
      | username | password |
      | Admin    | admin123 |
