
Feature: User Should be able to add product to the wish list.

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

When  User should click on the 'Shoping cart' menu on the top of the page.
And   User should Verify list of item or items added displayed and there should be a “Red” X” button for each item
When User click on the X buttion
Then User verify an “Are you sure…” message
When User select “Yes”, the item should be removed from the list.


@SDET_007
Scenario:  User should be able to add product to the wish list and User should see the number of the product.
When User click on product section from the porduct menue
And  User click on image or link of the product, The product datails should apear on the right side of the page
And  User verify the 'Heart' icon next to the 'Add To Card' option
Then User mouse over the 'Heart' icon it should show 'Add To The Wish List'
And  User clcik on 'Heart' icon
And  User should verify added 'list of the product' to thier wish list
And  User should verify the 'message apear' list
And  User verify list of item should appear when user select 'Whish list' menue from the top of the page
Then Verify If user add the same product to the Wish List, the item should not be repeated in the 'Shopping Cart'
And  User should see the number increased.  

















