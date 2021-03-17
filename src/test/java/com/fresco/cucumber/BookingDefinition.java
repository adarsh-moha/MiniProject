package com.fresco.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.*;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.support.ui.Select;


public class BookingDefinition{
	@Given("I am on the booking page")	
	public void imonTheBookingPage() {
		hooks.driver.get("file:///X:/Eclips_workspace/MiniProject/web/hotelbooking.html");
		// TODO Auto-generated method stub

	}
	
	@When("I check the page title")	
	public void icheckthepagetitle() {
		assertEquals("Hotel Booking", hooks.driver.getTitle());

	}
	
	@When("I click confirm booking button")	
	public void Iclickconfirmbookingbutton() {
		hooks.driver.findElement(By.cssSelector("#btnPayment")).click();
		
	}
	
	@When("I check for alert for first name")	
	public void Icheckforalertforfirstname() {
		assertEquals("Please fill the First Name", hooks.driver.switchTo().alert().getText());
		hooks.driver.switchTo().alert().dismiss();
	}
	
	@When("I enter first name and click confirm booking")	
	public void Ienterfirstnameandclickconfirmbooking() {
		hooks.driver.findElement(By.cssSelector("#txtFirstName")).sendKeys("firsrname");
		hooks.driver.findElement(By.cssSelector("#btnPayment")).click();

	}
	
	
	@When("I check for alert for last name")	
	public void Icheckforalertforlastname() {
		assertEquals("Please fill the Last Name", hooks.driver.switchTo().alert().getText());
		hooks.driver.switchTo().alert().dismiss();

	}
	
	@When("I enter last name and click confirm booking")	
	public void Ienterlastnameandclickconfirmbooking() {
		hooks.driver.findElement(By.cssSelector("#txtLastName")).sendKeys("lastname");
		hooks.driver.findElement(By.cssSelector("#btnPayment")).click();

	}
	
	@When("I check for alert for email")	
	public void Icheckforalertforemail() {
		assertEquals("Please fill the Email", hooks.driver.switchTo().alert().getText());
		hooks.driver.switchTo().alert().dismiss();

	}
	
	@When("I enter email and click confirm booking")	
	public void Ienteremailandclickconfirmbooking() {
		hooks.driver.findElement(By.cssSelector("#txtEmail")).sendKeys("firstname@fakemail.com");
		hooks.driver.findElement(By.cssSelector("#btnPayment")).click();

	}
	
	@When("I check for alert for mobile number")	
	public void Icheckforalertformobilenumber() {
		assertEquals("Please fill the Mobile No.", hooks.driver.switchTo().alert().getText());
		hooks.driver.switchTo().alert().dismiss();

	}
	
	@When("I enter invalid mobile no and click confirm booking")	
	public void Ienterinvalidmobilenoandclickconfirmbooking() {
		hooks.driver.findElement(By.cssSelector("#txtPhone")).sendKeys("12345");
		hooks.driver.findElement(By.cssSelector("#btnPayment")).click();

	}

	@When("I check for alert for contact no")	
	public void Icheckforalertforcontactno() {
		assertEquals("Please enter valid Contact no.", hooks.driver.switchTo().alert().getText());
		hooks.driver.switchTo().alert().dismiss();

	}

	@When("I enter contact no and click confirm booking")	
	public void Ientercontactnoandclickconfirmbooking() {
		hooks.driver.findElement(By.cssSelector("#txtPhone")).clear();
		hooks.driver.findElement(By.cssSelector("#txtPhone")).sendKeys("9496223456");
		hooks.driver.findElement(By.cssSelector("#btnPayment")).click();

	}

	@When("I check alert for city")	
	public void Icheckalertforcity() {
		assertEquals("Please select city", hooks.driver.switchTo().alert().getText());
		hooks.driver.switchTo().alert().dismiss();

	}

	@When("I select city and click confirm booking")	
	public void Iselectcityandclickconfirmbooking() {
		Select city = new Select(hooks.driver.findElement(By.cssSelector("[name='city']")));
		city.selectByValue("Pune");
		hooks.driver.findElement(By.cssSelector("#btnPayment")).click();


	}

	@When("I check alert for state")	
	public void Icheckalertforstate() {
		assertEquals("Please select state", hooks.driver.switchTo().alert().getText());
		hooks.driver.switchTo().alert().dismiss();

	}

	@When("I select state and click confirm booking")
	public void i_select_state_and_click_confirm_booking() {

		Select city = new Select(hooks.driver.findElement(By.cssSelector("[name='state']")));
		city.selectByValue("Maharashtra");
		hooks.driver.findElement(By.cssSelector("#btnPayment")).click();
	}

	@When("I check alert for cardholder name")
	public void i_check_alert_for_cardholder_name() {
		assertEquals("Please fill the Card holder name", hooks.driver.switchTo().alert().getText());
		hooks.driver.switchTo().alert().dismiss();
	}

	@When("I enter cardholder name and click confirm booking")
	public void i_enter_cardholder_name_and_click_confirm_booking() {

		hooks.driver.findElement(By.cssSelector("#txtCardholderName")).sendKeys("firstname");
		hooks.driver.findElement(By.cssSelector("#btnPayment")).click();
	}

	@When("I check for alert for debit card number")
	public void i_check_for_alert_for_debit_card_number() {
		assertEquals("Please fill the Debit card Number", hooks.driver.switchTo().alert().getText());
		hooks.driver.switchTo().alert().dismiss();
	}

	@When("I enter card details and click confirm booking")
	public void i_enter_card_details_and_click_confirm_booking() {

		hooks.driver.findElement(By.cssSelector("#txtDebit")).sendKeys("1234567890");
		hooks.driver.findElement(By.cssSelector("#btnPayment")).click();
	}

	@When("I check alert for cvv")
	public void i_check_alert_for_cvv() {
		assertEquals("Please fill the CVV", hooks.driver.switchTo().alert().getText());
		hooks.driver.switchTo().alert().dismiss();
	}

	@When("I enter cvv and click confirm booking")
	public void i_enter_cvv_and_click_confirm_booking() {
		hooks.driver.findElement(By.cssSelector("#txtCvv")).sendKeys("100");
		hooks.driver.findElement(By.cssSelector("#btnPayment")).click();
	}

	@When("I check alert for exp month")
	public void i_check_alert_for_exp_month() {
		assertEquals("Please fill expiration month", hooks.driver.switchTo().alert().getText());
		hooks.driver.switchTo().alert().dismiss();
	}

	@When("I enter exp month and click confirm booking")
	public void i_enter_exp_month_and_click_confirm_booking() {
		hooks.driver.findElement(By.cssSelector("#txtMonth")).sendKeys("November");
		hooks.driver.findElement(By.cssSelector("#btnPayment")).click();
	}

	@When("I check alert for exp year")
	public void i_check_alert_for_exp_year() {assertEquals("Please fill the expiration year", hooks.driver.switchTo().alert().getText());
	hooks.driver.switchTo().alert().dismiss();
	}

	@When("I enter exp year and click confirm booking")
	public void i_enter_exp_year_and_click_confirm_booking() {
		hooks.driver.findElement(By.cssSelector("#txtYear")).sendKeys("2060");
		hooks.driver.findElement(By.cssSelector("#btnPayment")).click();
	}

	@Then("I should go to success page")
	public void i_should_go_to_success_page() {
		assertEquals("Booking Completed!", hooks.driver.findElement(By.xpath("//h1")).getText());
	}
	
	
}