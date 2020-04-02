@Rest
Feature: Employee feature
  I want to use this template for my feature file

  @GetEmployees
  Scenario: Title of your scenario
    Given User set valid auth key
    When User send a Get request on "users"
    Then User should get status code 200
    
    @GetEmployee
  Scenario: Title of your scenario
    Given User set valid auth key
    And User send an id of 2
    When User send a Get request on "users/{id}"
    Then User should get status code 200
    
