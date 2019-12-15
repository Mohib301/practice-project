package pageObjects;

import org.openqa.selenium.ElementNotInteractableException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class AddingProdactToShoppingCardPageObjects extends Base {

	
	
	//div[@class='collapse navbar-collapse navbar-ex1-collapse']
	
	@FindBy(how = How.XPATH, using="//div[@class='collapse navbar-collapse navbar-ex1-collapse']")
	private WebElement BlueBarWebElement;
	
	public void blueBarDispayed() {
		BlueBarWebElement.isDisplayed();
	}
	
	//a[text()='Tablets']
	
	@FindBy(how = How.XPATH, using = "//a[text()='Tablets']")
	private WebElement clickOnTabletWebElement;
	
	public void clickingOnTablet() {
		try {
		clickOnTabletWebElement.click();
		}catch(ElementNotInteractableException e) {
			clickOnTabletWebElement.sendKeys(Keys.ENTER);
		}
	}
	
	//span[text()='Add to Cart']
	
	@FindBy(how = How.XPATH, using = "//span[text()='Add to Cart']")
	private WebElement addToCardVerificationWebElement;
	
	public void addToCardTextDisplayed() {
		addToCardVerificationWebElement.isDisplayed();
	}
	
	//a[text()='Samsung Galaxy Tab 10.1']
	@FindBy(how = How.XPATH, using = "//h4/a[text()='Samsung Galaxy Tab 10.1']")
	private WebElement clicksOnItemNameWebElement;
	
	public void clickOnItemName() {
		try {
		clicksOnItemNameWebElement.click();
	}catch(ElementNotInteractableException e) {
		clicksOnItemNameWebElement.sendKeys(Keys.ENTER);
	}
	}
	
	//div/div/div/div[@class='col-sm-4']
	
	@FindBy(how = How.XPATH, using = "//div/div/div/div[@class='col-sm-4']")
	private WebElement itemBoxDatailsWebElement;
	
	public void itemDatailsVerification() {
		itemBoxDatailsWebElement.isDisplayed();
	}
	
	//button[@id='button-cart']
	@FindBy(how = How.XPATH, using= "//button[@id='button-cart']")
	private WebElement clickAddToCardWebElement;
	
	public void addingToCard() {
		try {
		clickAddToCardWebElement.click();
	}catch(ElementNotInteractableException e) {
		clickAddToCardWebElement.sendKeys(Keys.ENTER);
	}
	}
	
	//div[@class='alert alert-success alert-dismissible']
	@FindBy(how = How.XPATH, using = "//div[@class='alert alert-success alert-dismissible']")
	private WebElement successMessageVerificationWebElement;
	
	public void successMessage() {
		successMessageVerificationWebElement.isDisplayed();
	}
	
	public AddingProdactToShoppingCardPageObjects() {
		PageFactory.initElements(driver, this);
	}
	
	
	
}
