package com.Development_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Search_Hotel {

	WebDriver driver;
	
	@FindBy(id="location")
	private WebElement location;
	
	@FindBy(id="hotels")
	private WebElement hotels;
	
	@FindBy(id="room_type")
	private WebElement type;
	
	@FindBy(id="room_nos")
	private WebElement room_nos;
	
	@FindBy(id="datepick_in")
	private WebElement in_date;
	
	@FindBy(id="datepick_out")
	private WebElement out_date;
	
	@FindBy(id="adult_room")
	private WebElement adult_count;
	
	@FindBy(id="child_room")
	private WebElement Child_count;
	
	@FindBy(id="Submit")
	private WebElement submit;
	
	@FindBy(id="radiobutton_0")
	private WebElement confirm;
	
	@FindBy(id="continue")
	private WebElement next;
	
	public WebElement getNext() {
		return next;
	}
	public WebElement getConfirm() {
		return confirm;
	}
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotels() {
		return hotels;
	}
	public WebElement getType() {
		return type;
	}
	public WebElement getRoom_nos() {
		return room_nos;
	}
	public WebElement getIn_date() {
		return in_date;
	}
	public WebElement getOut_date() {
		return out_date;
	}
	public WebElement getAdult_count() {
		return adult_count;
	}
	public WebElement getChild_count() {
		return Child_count;
	}
	public WebElement getSubmit() {
		return submit;
	}
	
	public Search_Hotel(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	
	
	
}
