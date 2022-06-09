package com.Development_Class;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Base_Class {

	public static WebDriver driver;
	
	
	public static WebDriver browserstart(String Browser) {//Browser launch
		if(Browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\RAJASEKAR K\\eclipse-workspace1\\Cucumber_Project\\Drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		}
		else if(Browser.equalsIgnoreCase("Firefox")) {
			System.setProperty("webdriver.gecko.driver",
					"C:\\Users\\RAJASEKAR K\\eclipse-workspace1\\mavenproject\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else {
			System.out.println("Invalid driver name");
		}
		driver.manage().window().maximize();
		return driver;
	}

	public static void url(String url) {
		
		driver.get(url);
	}
	
	public static void close() {
		driver.close();
	}
	
	public static void quit() {
		driver.quit();
	}
	
	public static void navigate(String url) {
		driver.navigate().to(url);
	}
	public static void back() {
		driver.navigate().back();
	}
	public static void forward() {
		driver.navigate().forward();
	}
	public static void refresh() {
		driver.navigate().refresh();
	}
	public static void alert(String action, String value) {
		
		if(action.equalsIgnoreCase("accept")) {
		driver.switchTo().alert().accept();
		}
		else if(action.equalsIgnoreCase("dismiss")) {
		driver.switchTo().alert().dismiss();
		}
		else if(action.equalsIgnoreCase("sendkeys")){
			driver.switchTo().alert().sendKeys(value);
		}
		else {
			System.out.println("Invalid parameter");
			
		}
				
	}
	
	public static void dragdrop(WebElement source,WebElement target) {
		
		
		Actions act = new Actions(driver);
		
		act.clickAndHold(source).moveToElement(target).release(source).build().perform();
		}
	
	public static void moveelement(String action ,WebElement target) {
	
		Actions act = new Actions(driver);
		
		if(action.equalsIgnoreCase("click")) {
	
		act.moveToElement(target).click().build().perform();
		}
		else if(action.equalsIgnoreCase("doubleclick")) {
			act.moveToElement(target).doubleClick().build().perform();
			
		}
		else if(action.equalsIgnoreCase("rightclick")) {
			act.moveToElement(target).contextClick().build().perform();
			
			}
		
		else if(action.equalsIgnoreCase("move")) {
			act.moveToElement(target).build().perform();
		}
			
		
		else {
			
			System.out.println("invalid action");
		}
		
	}
	
	public static void frame(String type,String frame_name) {
		
		if(type.equalsIgnoreCase("nameorid")) {
		driver.switchTo().frame(frame_name);
		}
		
		if(type.equalsIgnoreCase("index")) {
			
			int index =Integer.parseInt(frame_name);
			driver.switchTo().frame(index);
		}
				
	}
		
	public static void framebyxpath(WebElement element) {
		
		driver.switchTo().frame(element);
	}
	
	public static void senddata(WebElement element,String data ) {
		element.sendKeys(data);
		
	}
		
	public static void select(WebElement element,String Method,String value ) throws InterruptedException {
		Select SS = new Select(element);
		if(Method.equalsIgnoreCase("Index")) {
		int index = Integer.parseInt(value);
		SS.selectByIndex(index);
		}
		else if(Method.equalsIgnoreCase("value")) {
			SS.selectByValue(value);
			}
	else if(Method.equalsIgnoreCase("text")) {
			SS.selectByVisibleText(value);
			}
	else {
			System.out.println("Invalid value");
		}
	}
	
	public static void click(WebElement element) {
		
		element.click();
		
	}
	
	
		
	}
	

