Feature: Test Amazon.co.uk features
  I as user
  want to login
  and search product


  Scenario Outline: Login to Amazon.co.uk
    Given I am on "<HomePage>"
    When I Click SignIn Button
    Then Enter "<email>" and "<password>"
    And click SignIn
    Then I can see I am Logged In as "<nameDisplayed>"
    Examples:
      | HomePage     | email            | password    | nameDisplayed |
      | Amazon.co.uk | sss@testmail.com | password123 | Hello, sac    |


  Scenario Outline: Search the product
    Given I am on "<HomePage>"
    When I enter "<product>" into search product page
    Then I should see page showing "<product>"
    And I select the "<Size>"  and add product to Shopping cart
    Then I can see "<product>" in shopping cart
    Then I click on Proceed to Checkout

    Examples:
      | HomePage     | product                                  | Size |
      | Amazon.co.uk | Nike Men’s Air Max 90 Essential Trainers | 8 UK |


  Scenario Outline: March the price of the Product in Basket
    Given I am on "<HomePage>"
    When I enter "<product>" into search product page
    Then I should see page showing "<product>"
    And I select the "<Size>"  and add product to Shopping cart
    Then I check the price of the "<product>"
    Then I can see "<product>" in shopping cart
    And I check the price of the "<product>" in Shopping cart
    Then I check if the price is matching
    Examples:
      | HomePage     | product                                  | Size |
      | Amazon.co.uk | Nike Men’s Air Max 90 Essential Trainers | 8 UK |
