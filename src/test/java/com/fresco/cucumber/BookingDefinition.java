package com.fresco.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.*;
import org.openqa.selenium.support.ui.Select;


public class BookingDefinition{
	@Given("I am on the booking page")	
	public void imonTheBookingPage() {
		hooks.driver.get("file:///X:/Eclips_workspace/MiniProject/web/hotelbooking.html");
		// TODO Auto-generated method stub

	}
	
	@When("I check the page title")	
	public void icheckthepagetitle() {
		// TODO Auto-generated method stub

	}
	
	@When("I click confirm booking button")	
	public void Iclickconfirmbookingbutton() {
		// TODO Auto-generated method stub

	}
	
	@When("I enter first name and click confirm booking")	
	public void Ienterfirstnameandclickconfirmbooking() {
		// TODO Auto-generated method stub

	}
	
	@When("I check for alert for last name")	
	public void Icheckforalertforlastname() {
		// TODO Auto-generated method stub

	}
	
	@When("I enter last name and click confirm booking")	
	public void Ienterlastnameandclickconfirmbooking() {
		// TODO Auto-generated method stub

	}
	
	@When("I check for alert for email")	
	public void Icheckforalertforemail() {
		// TODO Auto-generated method stub

	}
	
	@When("I enter email and click confirm booking")	
	public void Ienteremailandclickconfirmbooking() {
		// TODO Auto-generated method stub

	}
	
	@When("I check for alert for mobile number")	
	public void Icheckforalertformobilenumber() {
		// TODO Auto-generated method stub

	}
	
	@When("I enter invalid mobile no and click confirm booking")	
	public void Ienterinvalidmobilenoandclickconfirmbooking() {
		
		// TODO Auto-generated method stub

	}

	@When("I check for alert for contact no")	
	public void Icheckforalertforcontactno() {
		
		// TODO Auto-generated method stub

	}

	@When("I enter contact no and click confirm booking")	
	public void Ientercontactnoandclickconfirmbooking() {
		
		// TODO Auto-generated method stub

	}

	@When("I check alert for city")	
	public void Icheckalertforcity() {
		
		// TODO Auto-generated method stub

	}

	@When("I select city and click confirm booking")	
	public void Iselectcityandclickconfirmbooking() {
		
		// TODO Auto-generated method stub

	}

	@When("I check alert for state")	
	public void Icheckalertforstate() {
		
		// TODO Auto-generated method stub

	}

	@When("I select state and click confirm booking")
	public void i_select_state_and_click_confirm_booking() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("I check alert for cardholder name")
	public void i_check_alert_for_cardholder_name() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("I enter cardholder name and click confirm booking")
	public void i_enter_cardholder_name_and_click_confirm_booking() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("I check for alert for debit card number")
	public void i_check_for_alert_for_debit_card_number() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("I enter card details and click confirm booking")
	public void i_enter_card_details_and_click_confirm_booking() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("I check alert for cvv")
	public void i_check_alert_for_cvv() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("I enter cvv and click confirm booking")
	public void i_enter_cvv_and_click_confirm_booking() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("I check alert for exp month")
	public void i_check_alert_for_exp_month() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("I enter exp month and click confirm booking")
	public void i_enter_exp_month_and_click_confirm_booking() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("I check alert for exp year")
	public void i_check_alert_for_exp_year() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@When("I enter exp year and click confirm booking")
	public void i_enter_exp_year_and_click_confirm_booking() {
	    // Write code here that turns the phrase above into concrete actions
	}

	@Then("I should go to success page")
	public void i_should_go_to_success_page() {
	    // Write code here that turns the phrase above into concrete actions
	}
	
	
}