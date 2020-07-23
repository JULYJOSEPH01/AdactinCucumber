package com.adactin.pom;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Confirmationpage extends Display {
	
	public Confirmationpage() {
		PageFactory.initElements(driver1, this);
	}

@FindBy(xpath="//input[@name='first_name']")

private WebElement fname;

@FindBy(xpath="//input[@name='last_name']")

private WebElement lname;

@FindBy(xpath="//textarea[@name='address']")

private WebElement billingadd;
@FindBy(xpath="//input[@name='cc_num']")

private WebElement creditcard;
@FindBy(xpath="//select[@name='cc_type']")

private WebElement cardtype;

@FindBy(xpath="//select[@name='cc_exp_month']")

private WebElement cardexxpire;


@FindBy(xpath="//select[@name='cc_exp_year']")

private WebElement cardexxpireyear;

@FindBy(xpath="//input[@name='cc_cvv']")

private WebElement cvvnumber;


@FindBy(xpath="//input[@name='book_now']")

private WebElement booknow;


public WebElement getBooknow() {
	return booknow;
}

public WebElement getFname() {
	return fname;
}

public WebElement getLname() {
	return lname;
}

public WebElement getBillingadd() {
	return billingadd;
	
}

public WebElement getCreditcard() {
	return creditcard;
}

public WebElement getCardtype() {
	return cardtype;
}

public WebElement getCardexxpire() {
	return cardexxpire;
}

public WebElement getCardexxpireyear() {
	return cardexxpireyear;
}

public WebElement getCvvnumber() {
	return cvvnumber;
}

}
