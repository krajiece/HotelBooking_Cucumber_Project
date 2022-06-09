package com.Development_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Book_Hotel {
    
	WebDriver driver;
	
	@FindBy(id="first_name")
	private WebElement Fname;
	
	@FindBy(id="last_name")
	private WebElement Lname;
	
	@FindBy(id="address")
	private WebElement Address;
	
	@FindBy(id="cc_num")
	private WebElement CardNo;
	
	@FindBy(id="cc_type")
	private WebElement Card_Type;
	
	@FindBy(id="cc_exp_month")
	private WebElement Exmonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement ExYear;
	
	@FindBy(id="cc_cvv")
	private WebElement CVV;
	
	@FindBy(id="book_now")
	private WebElement booknow;
	
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement Logout;
	
	public WebElement getLogout() {
		return Logout;
	}
	
	public WebElement getFname() {
		return Fname;
	}
	public WebElement getLname() {
		return Lname;
	}
	public WebElement getAddress() {
		return Address;
	}
	public WebElement getCardNo() {
		return CardNo;
	}
	public WebElement getCard_Type() {
		return Card_Type;
	}
	public WebElement getExmonth() {
		return Exmonth;
	}
	public WebElement getExYear() {
		return ExYear;
	}
	public WebElement getCVV() {
		return CVV;
	}
	public WebElement getBooknow() {
		return booknow;
	}
	
	public Book_Hotel(WebDriver driver) {
		this.driver=driver;
		
		PageFactory.initElements(driver, this);
		
	}
	
	
	
}
