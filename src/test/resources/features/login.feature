Feature: This feature tests the login page

  @login
  Scenario: Should acess with valid data
    Given I'm on the login page
    When I insert valid data
    Then I'm authenticated

  @login
  Scenario Outline: Shouldn't acess with invalid data
    Given I'm on the login page
    When I insert invalid <email> and invalid <password>
    Then I'm not authenticated

    Examples:
      | email                 | password     |
      | emailfake@outlook.com | fakePassword |
      | teste                 | 012345678910 |
      | emailfake@gmail.com   | null_value   |
      | null_value            | Wrong123@456 |
      | null_value            | null_value   |

  @login
  Scenario: Shouldn't access restricted page without being authenticated
    Given I'm on the login page
    When I try acess some restrict page without being authenticated
    Then I'm forwarded to the login page