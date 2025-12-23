package testNg;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pom.BaseClass;
import pom.HomePage;

public class ConfigurationAnnotation extends BaseClass{
	
	WebDriver driver=null;
	
	@Test
	public void Register() {

		HomePage hp=new HomePage(driver);
		hp.getRegisterLink().click();
	}
	
	@Test
	public void shoppingCart() {
		Reporter.log("Resgister process Completed",true);
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}


