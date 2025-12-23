package com.ninzacrm.genericutility;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverUtility {

	WebDriver driver;
	
	public void launchTheBrowser() {
		driver=new ChromeDriver();
	}
	
	
	public void toMaximizeTheBrowser() {
		driver.manage().window().maximize();
	}
}
