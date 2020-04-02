
@LogIn
Feature: Login Page
  As a user, I should be able to log in
  So I can buy Products

  @ValidCredentials
  Scenario: User should be able to login
    Given User is on login page
    When User enters username as "test800@hotmail.com"
    And User enters password as "test123"
    And User clicks on sign in button
    Then User should be logged correctly
    
    
    @Userpurchase
  Scenario: User should be able to make a purchase
  	Given User is on login page
    And User logs in correctly "test800@hotmail.com", "test123"
    And User is logged in and on their account page
    When User clicks on the Women button
    And User clicks on the Faded Shirt image
    And User clicks on Add to cart button
    And User clicks Proceed to checkout button
    And User clicks Proceed to checkout button in the shopping cart summary page
    And User clicks Proceed to checkout button in the address page
    And User clicks on the Terms of Service checkbox
    And User clicks Proceed to checkout button in the shipping page
    And User clicks on Pay by bank wire button
    Then User should see their payment and purchase information


  
