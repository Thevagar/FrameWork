package pom;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import com.ninzacrm.genericutility.FileUtility;

public class BaseClass {

	WebDriver driver;
	@BeforeSuite
	public void BS() {
		Reporter.log("connected to db",true);
	}
	
	
	@AfterSuite()
	public void AS() {
		Reporter.log("close db",true);
	}
	
	
	@BeforeClass
	public void BC() {
		ChromeOptions opt=new ChromeOptions();
		
		Map<String,Object> prefs=new HashMap<String, Object>();
		prefs.put("credentials_enable_service",false);
		prefs.put("profile.password_manager_enabled",false);
		opt.setExperimentalOption("prefs",prefs);
		driver=new ChromeDriver();
		driver.get("https://demowebshop.tricentis.com/");
	}
	
	@AfterClass
	public void AC() {
		driver.quit();
	}
	
	@BeforeMethod
	public void BM() throws IOException {
		
//		FileUtility futil=new FileUtility();
//		String URL = futil.getDataFromProperties("url");
		
		Reporter.log("Login process",true);
	}
	
	@AfterMethod()
	public void AM(){
		Reporter.log("Logout Process",true);
	}
	
}
