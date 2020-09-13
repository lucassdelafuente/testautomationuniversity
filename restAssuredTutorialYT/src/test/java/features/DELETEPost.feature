Feature: DELTEPosts
  Test the delete operation

  @smoke
  Scenario: Verify DELETE operation after POST
    Given I ensure to perform POST operation for "/posts" with body as
      | id | title              | author            |
      | 6  | API Testing course | ExecuteAutomation |
    And I perform DELETE operation for "/posts/{postid}"
      | postid |
      | 6      |
    And I perform GET operation with path parameter for "/posts/{postid}"
      | postid |
      | 6      |
    Then I "should not" see the body with title as "API Testing course"
    And I should see that the status code is 404