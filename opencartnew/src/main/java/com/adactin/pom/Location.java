package com.adactin.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Location extends Login {
	public Location() {
		PageFactory.initElements(driver1, this);
	}
@FindBy(xpath="//select[@name='location']")
	
	private WebElement location;
@FindBy(xpath="//select[@name='hotels']")

private WebElement hotels;
@FindBy(xpath="//select[@name='room_type']")

private WebElement roomtype;

@FindBy(xpath="//select[@id='room_nos']")

private WebElement noofroom;
@FindBy(xpath="//input[@name='datepick_in']")

private WebElement checkindate;

@FindBy(xpath="//input[@id='datepick_out']")

private WebElement checkoutdate;
@FindBy(xpath="//select[@name='adult_room']")

private WebElement adultroom;
@FindBy(xpath="//select[@name='child_room']")

private WebElement childroom;
@FindBy(xpath="//input[@type='submit']")

private WebElement searchbutton;
public WebElement getLocation() {
	return location;
}
public WebElement getHotels() {
	return hotels;
}
public WebElement getRoomtype() {
	return roomtype;
}
public WebElement getNoofroom() {
	return noofroom;
}
public WebElement getCheckindate() {
	return checkindate;
}
public WebElement getCheckoutdate() {
	return checkoutdate;
}
public WebElement getAdultroom() {
	return adultroom;
}
public WebElement getChildroom() {
	return childroom;
}
public WebElement getSearchbutton() {
	return searchbutton;
}

}
