package com.fresco.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.*;

import static org.junit.Assert.assertEquals;

import java.util.*;

public class BookingSuccessDefinition{
	@Given("I am on Success page")
	public void i_am_on_Success_page() {
		hooks.driver.get("file:///X:/Eclips_workspace/MiniProject/web/success.html");
	}

	@When("i check page title")
	public void i_check_page_title() {
		assertEquals("Payment Details", hooks.driver.getTitle());
	}

	@Then("close the browser")
	public void close_the_browser() {
		hooks.driver.close();
	}
}