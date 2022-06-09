package com.stepdef;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.Development_Class.Base_Class;
import com.Development_Class.FileReader_Mamager;
import com.Development_Class.PageObjectManager;
import com.runner.Runner_Class;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class Step_Def_Login extends Base_Class {
	
	WebDriver driver = Runner_Class.driver;
	PageObjectManager obj = new PageObjectManager(driver);
	
//Login Page
	@Given("user launch the http:\\/\\/adactinhotelapp.com")
	public void user_launch_the_http_adactinhotelapp_com() {
		url("http://adactinhotelapp.com");
	}
	@When("user given the valid user name in the text box")
	public void user_given_the_valid_user_name_in_the_text_box() throws IOException { 
		senddata(obj.getLogin().getUser(),FileReader_Mamager.getInstanceFR().getInstanceCR().getuser());
	}@When("user given the valid password in the text box")
	public void user_given_the_valid_password_in_the_text_box() throws IOException {
		senddata(obj.getLogin().getPwd(), FileReader_Mamager.getInstanceFR().getInstanceCR().pwd());
	}
	@When("user click the login button")
	public void user_click_the_login_button() {
	    click(obj.getLogin().getLogin());
	}
	@Then("user can view the next page as search button page")
	public void user_can_view_the_next_page_as_search_button_page() {
	   System.out.println("login page sucessfully completed");
		}
//Serch Hotel
	@Given("user select the location by drop down options")
	public void user_select_the_location_by_drop_down_options() throws InterruptedException {
	    select(obj.getSearch().getLocation(),"text","London");
	}
	@Given("user select the Hotel by drop down options")
	public void user_select_the_hotel_by_drop_down_options() throws InterruptedException {
	    select(obj.getSearch().getHotels(),"text","Hotel Hervey");
	}
	@Given("user select the Room Type by drop down options")
	public void user_select_the_room_type_by_drop_down_options() throws InterruptedException {
	   select(obj.getSearch().getType(),"text","Deluxe");
	}
	@Given("user select the No of Rooms by drop down options")
	public void user_select_the_no_of_rooms_by_drop_down_options() throws InterruptedException {
	    select(obj.getSearch().getRoom_nos(),"text","4 - Four");
	}
	@Given("user given the Check in date in text box")
	public void user_given_the_check_in_date_in_text_box() {
	   senddata(obj.getSearch().getIn_date(), "25/06/2022");
	}
	@Given("user given the Check out date in text box")
	public void user_given_the_check_out_date_in_text_box() {
	    senddata(obj.getSearch().getOut_date(), "28/06/2022");
	}
	@Given("user select the No of Adults per Room by drop down options")
	public void user_select_the_no_of_adults_per_room_by_drop_down_options() throws InterruptedException {
	    select(obj.getSearch().getAdult_count(),"text","2 - Two");
	}
	@Given("user select the No of Children per Room by drop down options")
	public void user_select_the_no_of_children_per_room_by_drop_down_options() throws InterruptedException {
	   select(obj.getSearch().getChild_count(),"text","2 - Two");
	}
	@When("user click the serch button")
	public void user_click_the_serch_button() {
	   click(obj.getSearch().getSubmit());
	}
	@Then("user can view the next page as select hotel")
	public void user_can_view_the_next_page_as_select_hotel() {
	    System.out.println("Hotel serch completed sucessfully ");
	}
	//Select Hotel
	
	@Given("user click the redio button")
	public void user_click_the_redio_button() {
		click(obj.getSearch().getConfirm());
	}
	@When("user click the continue button")
	public void user_click_the_continue_button() {
	    click(obj.getSearch().getNext());
	}
	@Then("user can view the next page as Book hotel page")
	public void user_can_view_the_next_page_as_book_hotel_page() {
	    System.out.println("Hotel selected Sucessfully");
	}
	
	//Book Hotel
	
	@Given("user given the first name in text box")
	public void user_given_the_first_name_in_text_box() {
	   senddata(obj.getBook().getFname(), "K");
	}
	@Given("user givn the last name in text box")
	public void user_givn_the_last_name_in_text_box() {
	    senddata(obj.getBook().getLname(),"Rajasekar");
	}
	@Given("user given the Billing address in text area")
	public void user_given_the_billing_address_in_text_area() {
	    senddata(obj.getBook().getAddress(), "chennai Tamilnadu INDAI 600069");
	}
	@Given("user given the Credit Card No in text box")
	public void user_given_the_credit_card_no_in_text_box() throws IOException {
	    senddata(obj.getBook().getCardNo(), FileReader_Mamager.getInstanceFR().getInstanceCR().CardNo());
	}
	@Given("user select the Credit Card Type in drop down")
	public void user_select_the_credit_card_type_in_drop_down() throws InterruptedException {
	   select(obj.getBook().getCard_Type(),"text","VISA");
	}
	@Given("user select the Expiry Month in drop down")
	public void user_select_the_expiry_month_in_drop_down() throws InterruptedException {
	    select(obj.getBook().getExmonth(),"text","April");
	}
	@Given("user select the Expiry year in drop down")
	public void user_select_the_expiry_year_in_drop_down() throws InterruptedException {
	    select(obj.getBook().getExYear(),"text","2022");
	}
	@Given("user given the CVV in text box")
	public void user_given_the_cvv_in_text_box() throws IOException {
	    senddata(obj.getBook().getCVV(), FileReader_Mamager.getInstanceFR().getInstanceCR().Cvv());
	}
	@When("user click the Book Bow button")
	public void user_click_the_book_bow_button() {
	    click(obj.getBook().getBooknow());
	}
	@Then("user will get booking confirmation details")
	public void user_will_get_booking_confirmation_details() {
	    System.out.println("Hotel Booked completed sucessfully");
	}
	//Log Out
	
	@Given("user click the logout button")
	public void user_click_the_logout_button() {
	    click(obj.getBook().getLogout());
	}
	@Then("user will get page as You have successfully logged out")
	public void user_will_get_page_as_you_have_successfully_logged_out() {
	    System.out.println("Application logout completed sucessfully");
	}






	
	



}
