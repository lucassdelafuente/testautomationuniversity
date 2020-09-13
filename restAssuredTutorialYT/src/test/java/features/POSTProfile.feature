Feature: POSTProfile
  Test POST operation using REST-assured
  Scenario: Verify Post operation
  Given I perform POST operation for "/post"

  Scenario: Verify POST operation for Profile
  Given I perform POST operation for "/post/{profileNo}/profile" with body
  | name | profile |
  | Sams | 2       |
  Then I should see the body has name as "Sams"