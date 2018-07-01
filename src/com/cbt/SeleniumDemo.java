package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumDemo {
	public static void main (String[]arg) {
		System.setProperty("webdriver.gecko.driver",
		"/Users/mariana/Documents/selenium dependencies/drivers/geckodriver 2");
		WebDriver driver = new FirefoxDriver();
		driver.get("http:cybertekschool.com");
	
	
	}

}
