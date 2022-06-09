package com.Development_Class;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {

     WebDriver driver;
	
    @FindBy(id="username")
	private WebElement user;
    
    @FindBy(name="password")
	private WebElement pwd;
    
    @FindBy(id="login")
	private WebElement login;
	
	public WebElement getUser() {
		return user;
	}
	public WebElement getPwd() {
		return pwd;
	}
	public WebElement getLogin() {
		return login;
	}
	
	public Login(WebDriver driver) {
		
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
}
