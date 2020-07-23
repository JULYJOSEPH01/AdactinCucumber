
package com.adactin.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bookeditenary extends Display{
	
	public Bookeditenary() {
		PageFactory.initElements(driver1, this);
	}
	@FindBy(xpath="(//input[@type='button'])[2]")

	private WebElement myitenary;

@FindBy(xpath="//input[@name='cancelall']")

private WebElement cancell;

public WebElement getCancell() {
	return cancell;
	
}

public WebElement getMyitenary() {
	return myitenary;
}

}
