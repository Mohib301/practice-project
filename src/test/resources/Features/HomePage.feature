
Feature: Home Page
# this is name of scenario
@canvas
Scenario: Test login to Canvas Page

Given User is on Tek School Page
When User Click on Login button on top of the page
Then User should see Canvas Login Page