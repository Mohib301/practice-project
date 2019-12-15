Feature: After adding item to "Shoping card" User should remove it from "Shoping Cart"

Background: 
Given User is on TekSchool page
And User Click on Test Environment link 
And User should see Test Environment page
When User click on myAccount menu on top if the page
And User click on login on myAccount menu
And User enter username 'teststudent@gmail.com' and password 'Tek@Test.com' in returning menu
And User click on login button
Then User should be loged in   
 
 Given User should see the blue bar at the product section
Then User clicks on the desire product
And User should see label of 'Add to cart' under each product
When user clicks on the item 
Then User should see the detailed list of the product on right side of the page
And User clicks 'Add to Cart' button
Then User should see 'you have added NAME OF PRODUCT to your shoping cart' success message

@SEDT_006
Scenario: After adding item or I tems to the "Shoping Cart"user should be able to remove item or items successfully from the  "Shoping Cart"

When  User should click on the 'Shoping cart' menu on the top of the page.
And   User should Verify list of item or items added displayed and there should be a “Red” X” button for each item
When User click on the X buttion
Then User verify an “Are you sure…” message
When User select “Yes”, the item should be removed from the list.

