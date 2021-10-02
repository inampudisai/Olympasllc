@Bobtailin
  Feature: Test Scenarios for Bobtailin
    As a customer I can select bobtailin delivery type
    So that I can book without trailer for oneway delivery
  @test
    Scenario: Test bobtail in scenario
      Given I am in energy solutions home page
      And login with test credentials
      And Navigate to new order Page
      When I add all the related details to book a bobtailin delivery
      Then I should see a confirmation message
      And The order status should be "Test"
