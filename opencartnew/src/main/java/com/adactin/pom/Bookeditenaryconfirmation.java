
package com.adactin.pom;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bookeditenaryconfirmation  extends Bookeditenary{
	
	public Bookeditenaryconfirmation() {
		PageFactory.initElements(driver1, this);
	}
	
	

@FindBy(xpath="//a[text()='Booked Itinerary']")

private WebElement Bookedbutton;
	
@FindBy(xpath="//input[@name='order_id_347383']")

private WebElement lordeerid ;

@FindBy(xpath="(//input[@type='submit'])[1]")

private WebElement lgo;
public WebElement getLgo() {
	return lgo;
}
public WebElement getLprice() {
	return lprice;
}



@FindBy(xpath="//input[@name='total_price_347383']")

private WebElement lprice
;







public WebElement getLordeerid() {
	return lordeerid;
}



@FindBy(xpath="//input[@name='order_id_347383']")

private WebElement lhotelname ;

@FindBy(xpath="//input[@name='location_347383']")

private WebElement  llocation ;

@FindBy(xpath="//input[@name='rooms_347383']")

private WebElement lrooms  ;


@FindBy(xpath="//input[@name='first_name_347383']")

private WebElement lfirstname  ;

@FindBy(xpath="//input[@name='last_name_347383']")

private WebElement llastname  ;


@FindBy(xpath="//input[@name='arr_date_347383']")

private WebElement larrivaldate  ;

@FindBy(xpath="//input[@name='dep_date_347383']")

private WebElement ldeptdate  ;

@FindBy(xpath="//input[@name='room_type_347383']")

private WebElement lroomtype ;
@FindBy(xpath="//input[@name='order_id_text']")

private WebElement lsearchid ;
public WebElement getBookedbutton() {
	return Bookedbutton;
}
public WebElement getLhotelname() {
	return lhotelname;
}
public WebElement getLlocation() {
	return llocation;
}
public WebElement getLrooms() {
	return lrooms;
}
public WebElement getLfirstname() {
	return lfirstname;
}
public WebElement getLlastname() {
	return llastname;
}
public WebElement getLarrivaldate() {
	return larrivaldate;
}
public WebElement getLdeptdate() {
	return ldeptdate;
}
public WebElement getLroomtype() {
	return lroomtype;
}
public WebElement getLsearchid() {
	return lsearchid;
}



	
}
