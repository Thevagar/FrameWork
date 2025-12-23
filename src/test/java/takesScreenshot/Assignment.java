package takesScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assignment {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.flipkart.com/");
		
		
		List<WebElement> icons = driver.findElements(By.xpath("//div[@class='YBLJE4']"));
		for (WebElement icon : icons) {
			String iconName = icon.getText();
			File img = icon.getScreenshotAs(OutputType.FILE);
			
			File dest = new File("./screenshot/"+iconName+".png");
			
			FileHandler.copy(img, dest);
			
		}
	}

}
