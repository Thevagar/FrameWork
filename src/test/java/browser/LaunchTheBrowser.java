package browser;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chromium.ChromiumDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchTheBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();// 1st line
//		driver.manage().window().maximize();
		driver.manage().window().setSize(new Dimension(2500, 500));
		driver.get("https://www.amazon.in/");
		
		Point pointValue = driver.manage().window().getPosition();
		System.out.println("point  "+pointValue);
		Thread.sleep(3000);
		
		
		driver.manage().window().minimize();
		
//		driver.quit();
	
		 
//		String title = driver.getTitle();
		
//		System.out.println("Title  -->"+title);
		
		
		
	
	}

}
