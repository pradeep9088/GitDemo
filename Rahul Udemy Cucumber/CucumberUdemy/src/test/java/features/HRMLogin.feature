Feature: Orange HRM application

  @SmokeTest
  Scenario Outline: Orange HRM application login
    Given user is on orange HRM application page
    When enter <username> and <password>
    When user click on login button
    Then user should be logged in succesfully
    When user validate "Admin" tab
    When user validate "PIM" tab
    When user validate "Leave" tab

    Examples: 
      | username | password |
      | Admin    | admin123 |
