package com.Development_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageObjectManager {
	
	WebDriver driver;
	
	private Login login;
	private Search_Hotel search;
	private Book_Hotel book;
	
	
	public Login getLogin() {
		
		login = new Login(driver);
		return login;
	}
	public Search_Hotel getSearch() {
		
		search = new Search_Hotel(driver);
		return search;
	}
	public Book_Hotel getBook() {
		
		book = new Book_Hotel(driver);
		return book;
	}
	
	public PageObjectManager(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
	

}
