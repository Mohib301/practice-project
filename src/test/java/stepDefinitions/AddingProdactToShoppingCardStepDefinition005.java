package stepDefinitions;

import core.Base;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.AddingProdactToShoppingCardPageObjects;
import utilities.Utility;

public class AddingProdactToShoppingCardStepDefinition005 extends Base {

	
	
	AddingProdactToShoppingCardPageObjects shoppingCardPageObject = new AddingProdactToShoppingCardPageObjects();
	
	
	@Given("^User should see the blue bar at the product section$")
	public void user_should_see_the_blue_bar_at_the_product_section() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		shoppingCardPageObject.blueBarDispayed();
		
	}

	@Then("^User clicks on the desire product$")
	public void user_clicks_on_the_desire_product() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Utility.screenshot(driver);
		shoppingCardPageObject.clickingOnTablet();
	}

	@Then("^User should see label of 'Add to cart' under each product$")
	public void user_should_see_label_of_Add_to_cart_under_each_product() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		shoppingCardPageObject.addToCardTextDisplayed();
	}

	@When("^user clicks on the item$")
	public void user_clicks_on_the_item() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Utility.screenshot(driver);
		shoppingCardPageObject.clickOnItemName();
	}

	@Then("^User should see the detailed list of the product on right side of the page$")
	public void user_should_see_the_detailed_list_of_the_product_on_right_side_of_the_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		shoppingCardPageObject.itemDatailsVerification();
		Utility.screenshot(driver);
	}
	
	@Then("^User clicks 'Add to Cart' button$")
	public void user_clicks_Add_to_Cart_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		shoppingCardPageObject.addingToCard();
	}

	@Then("^User should see 'you have added NAME OF PRODUCT to your shoping cart' success message$")
	public void user_should_see_you_have_added_NAME_OF_PRODUCT_to_your_shoping_cart_success_message() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		shoppingCardPageObject.successMessage();
		Utility.screenshot(driver);
	}

}
