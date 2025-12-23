package testScript;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.HomePage;

public class RegisterPage {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.get("https://demowebshop.tricentis.com/");
		
		
		HomePage hp=new HomePage(driver);
		
		hp.getRegisterLink().click();
		
		pom.RegisterPage rp=new pom.RegisterPage(driver);
		
		rp.getFirstName().sendKeys("Donny");
		rp.getLastName().sendKeys("donny");
		rp.getEmail().sendKeys("hksgdhsg@gmail.com");
	}

}
