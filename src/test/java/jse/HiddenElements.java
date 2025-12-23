package jse;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver =new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/r.php?entry_point=login");
		
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		
		WebElement hiddenElement = driver.findElement(By.id("custom_gender"));
		jse.executeScript("arguments[1].value='not to specify'", hiddenElement);
	}

}
