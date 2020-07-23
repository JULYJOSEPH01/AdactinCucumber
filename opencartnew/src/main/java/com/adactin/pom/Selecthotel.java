package com.adactin.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Selecthotel extends Location {
	public Selecthotel() {
		PageFactory.initElements(driver1, this);
	}
@FindBy(xpath="//input[@name='location_0']")
	
	private WebElement location;

@FindBy(xpath="//input[@name='hotel_name_0']")

private WebElement hotelname;
@FindBy(xpath="//input[@name='rooms_0']")

private WebElement room;
@FindBy(xpath="//input[@name='room_type_0']")

private WebElement roomtype;
@FindBy(xpath="//input[@name='arr_date_0']")

private WebElement arrivaldate;

@FindBy(xpath="//input[@id='dep_date_0']")
private WebElement depdate;

public WebElement getLocation() {
	return location;
}

public WebElement getHotelname() {
	return hotelname;
}

public WebElement getRoom() {
	return room;
}

public WebElement getArrivaldate() {
	return arrivaldate;
}

public WebElement getDepdate() {
	return depdate;
	
}

public WebElement getRoomtype() {
	return roomtype;
}









}
