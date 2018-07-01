package com.cbt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSearch {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver",
				"/Users/mariana/Documents/selenium dependencies/drivers/geckodriver 2");
				WebDriver driver = new FirefoxDriver();
				driver.get("https://google.com");
				
	}

}
