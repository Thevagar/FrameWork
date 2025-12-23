package testNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class M12 {

	@Test(groups = "smoke testing")
	public void m4() {
		Reporter.log("execution from m4", true);
	}

	@Test(groups ="smoke testing" )
	public void m1() {
		Reporter.log("execution from m1", true);
	}

	@Test(priority = 0)
	public void m3() {
		Reporter.log("execution from m3", true);
	}

	@Test(priority = -5,invocationCount = 0)
	public void m2() {
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Reporter.log("execution from m2", true);
	}

}
