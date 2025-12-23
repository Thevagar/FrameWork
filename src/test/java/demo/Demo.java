package demo;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.ninzacrm.genericutility.FileUtility;
import com.ninzacrm.genericutility.WebDriverUtility;

public class Demo {

	WebDriver driver;
	
	@Test
	public void testCase1() {
		FileUtility fUtil=new FileUtility();
		WebDriverUtility wUtil=new WebDriverUtility();
		wUtil.launchTheBrowser();
		wUtil.toMaximizeTheBrowser();
		
	
	}
}
