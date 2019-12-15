package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class RemovingItemFromCardPageObject extends Base{

	//span[text()='Shopping Cart']
	@FindBy(how = How.XPATH, using ="//span[text()='Shopping Cart']")
	private WebElement clickOnShoppingCartOnTop;
	
	
	@FindBy(how = How.XPATH, using ="//form[@action='https://tekschoolofamerica.com/test-environment/index.php?route=checkout/cart/edit']")
	private WebElement itemAddedAndRedButtonX;
	
	



public RemovingItemFromCardPageObject() {
	
		PageFactory.initElements(driver, this);
}

	
}