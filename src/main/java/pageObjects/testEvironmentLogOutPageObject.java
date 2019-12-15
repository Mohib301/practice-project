package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class testEvironmentLogOutPageObject extends Base {

	public testEvironmentLogOutPageObject() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(how = How.XPATH, using = "//span[text()='My Account']")
	private WebElement myAccount;	

@FindBy(how = How.XPATH, using = "//ul/li/a[text()='Logout']")
private WebElement logoutButton;


@FindBy(how = How.XPATH, using = "//div[@id='content']/p")
private WebElement textVerification;

@FindBy(how = How.XPATH, using = "//span[text()='My Account']")
private WebElement myAccountVerification;



public void myAccountlogin() {
	myAccount.click();
}
public void logoutButtonof() {
	logoutButton.click();
}

public void textVerify() {
	boolean t = textVerification.isDisplayed();
	if(t==true) {
		
	
}
}
public void myAccountVerificationElement() {
	myAccountVerification.click();
}



}







