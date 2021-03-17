package com.fresco.cucumber;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import java.util.*;


import cucumber.api.java.After;
import cucumber.api.java.Before;

public class hooks {
	public static WebDriver driver;

	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver", "/projects/challenge/chromedriver");
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--disable-dev-shm-usage");
        driver=new ChromeDriver(options);
	}

	@After
	public void cleanUp() {
		driver.close();
	}

}