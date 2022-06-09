package com.runner;



import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

import com.Development_Class.Base_Class;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = 
"C:\\Users\\RAJASEKAR K\\eclipse-workspace1\\Cucumber_Project\\src\\test\\java\\com\\feature\\HotelBooking.feature",
glue = "com.stepdef",
monochrome = true,
plugin = {"pretty","html:target/cucumber-reports","json:Report/jsonReport.jon",
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"})




public class Runner_Class {

	public static WebDriver driver;
	
	@BeforeClass
	public static void setup() {

		driver = Base_Class.browserstart("chrome");
	}
	@AfterClass
	public static void end() {
		
		Base_Class.close();
	}
}
