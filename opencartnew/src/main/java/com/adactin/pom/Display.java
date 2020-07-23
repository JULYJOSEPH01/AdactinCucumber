package com.adactin.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Display extends Location {
	
	public Display() {
		PageFactory.initElements(driver1, this);
	}
@FindBy(xpath="//a[text()='Logout']")
	
	private WebElement logoutbutton;
@FindBy(xpath="//input[@name='continue']")

private WebElement continuebutton;
@FindBy(xpath="//input[@name='radiobutton_0']")

private WebElement radiobutton;
@FindBy(xpath="//input[@id='cancel']")

private WebElement cancelbutton;
public WebElement getLogoutbutton() {
	return logoutbutton;
	
}

public WebElement getContinuebutton() {
	return continuebutton;
	
}

public WebElement getRadiobutton() {
	return radiobutton;
	
}

public WebElement getCancelbutton() {
	return cancelbutton;
}

}
