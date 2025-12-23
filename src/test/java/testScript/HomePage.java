package testScript;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HomePage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
//		Fil
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://demowebshop.tricentis.com/");
		
		pom.HomePage hp=new pom.HomePage(driver);
		hp.getRegisterLink().click();
		
		

	}

}
