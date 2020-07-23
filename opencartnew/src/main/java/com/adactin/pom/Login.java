package com.adactin.pom;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.baseclass.adactin.Baseadactin;


public class Login extends Baseadactin {
	public Login() {
		PageFactory.initElements(driver1, this);
	}
@FindBy(xpath="//input[@type='text']")
	
	private WebElement username;
@FindBy(xpath="//input[@type='password']")
private WebElement pw;
@FindBy(xpath="//input[@type='Submit']")
private WebElement login;

public WebElement getUsername() {
	return username;
}
public WebElement getPw() {
	return pw;
}
public WebElement getLogin() {
	return login;
}

}