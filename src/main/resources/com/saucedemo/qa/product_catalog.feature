Feature: Product Catalogue

  I as a user,
  Want to navigate to the product catalog
  So that I can check what products exist

  Background: Login as a standard user
    Given I am in login page
    When I login as standard user
    Then I expect to login successfully as standard user

  Scenario: Check the product catalogue
    Given I am in products catalogue page
    Then I check all products are correctly displayed