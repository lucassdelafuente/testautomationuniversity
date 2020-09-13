Feature:
  Verify different GET operations using REST-Assured

  Scenario: Verify one author of the post
    Given I perform GET operation for "/posts"
    Then I should see the author name as "Karthik KK"

  Scenario: Verify one author of the post
    Given I perform GET operation for "/post"
    Then I should see the author names

  Scenario: Verify one author of Get with Path Parameter
    Given I perform GET operation for "/post"
    Then I should see verify GET Parameter with Path

  Scenario: Verify one author of Get with Query Parameter
    Given I perform GET operation for "/post"
    Then I should see verify GET Parameter with Query

  Scenario: Verify GET operation with bearer authentication token for json schema validation
    Given I perform authentication operation for "/auth/login" with body
      | email           | password |
      | lucas@gmail.com | lucas123 |
    And I perform GET operation for "/posts/1"
    Then I should see the author name as "Karthik KK" with JSON validation