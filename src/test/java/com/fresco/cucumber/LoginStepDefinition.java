package com.fresco.cucumber;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

import static org.junit.Assert.assertEquals;

import java.util.*;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.*;


public class LoginStepDefinition {
	@Given("I am on the login page")
	public void i_am_on_the_login_page() {
		hooks.driver.get(System.getProperty("user.dir")+"/web/login.html");
		// TODO Auto-generated method stub
	}

	@When("I check page title")
	public void i_check_page_title() {
		assertEquals("Login", hooks.driver.getTitle());
	}

	@When("I enter username only")
	public void i_enter_username_only() {
		hooks.driver.findElement(By.name("userName")).sendKeys("admin");
		
	}

	@When("I click on Login button{int}")
	public void i_click_on_Login_button(Integer int1) {
		try {
			hooks.driver.findElement(By.cssSelector("input[value='Login']")).click();
		} catch (Exception e) {
			
		}
		
		
	}

	@When("I check for error message")
	public void i_check_for_error_message() {
	   assertEquals("* Please enter password.", hooks.driver.findElement(By.cssSelector("#pwdErrMsg")).getText());
	}

	@When("I enter wrong password")
	public void i_enter_wrong_password() {
		hooks.driver.findElement(By.cssSelector("input[name='userPwd']")).clear();
		hooks.driver.findElement(By.cssSelector("input[name='userPwd']")).sendKeys("9496223456");
		hooks.driver.findElement(By.cssSelector("input[value='Login']")).click();
	}

	@When("I check for alert")
	public void i_check_for_alert() {
		assertEquals("Invalid login! Please try again!", hooks.driver.switchTo().alert().getText());
		hooks.driver.switchTo().alert().dismiss();
	}

	@When("I enter correct details")
	public void i_enter_correct_details() {
		hooks.driver.findElement(By.cssSelector("input[name='userPwd']")).clear();
		hooks.driver.findElement(By.cssSelector("input[name='userPwd']")).sendKeys("admin");
	
	}

	@When("I click on Login Button{int}")
	public void i_click_on_Login_Button(Integer int1) {
		hooks.driver.findElement(By.cssSelector("input[value='Login']")).click();
	}

	@Then("I expect to go to next page")
	public void i_expect_to_go_to_next_page() {
		assertEquals("Hotel Booking Form", hooks.driver.findElement(By.xpath("//h2")).getText());
	}
}