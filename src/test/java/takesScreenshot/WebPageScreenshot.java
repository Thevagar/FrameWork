package takesScreenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class WebPageScreenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
			WebDriver driver =new ChromeDriver();
			
			driver.manage().window().maximize();
			
			driver.get("https://www.myntra.com/");
			
			
			TakesScreenshot tks = (TakesScreenshot)driver;
			
			File temp = tks.getScreenshotAs(OutputType.FILE);
			
			
			File perma = new File("./screenshot/homePage.png");
			
			FileHandler.copy(temp, perma);
			
			
			
			
	}

}
