package browser;

import java.util.Set;

import org.jspecify.annotations.Nullable;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class handleMethods {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://shoppersstack.com/products_page/57");
		
		String ParentId = driver.getWindowHandle();

		Thread.sleep(5000);
		driver.findElement(By.id("compare")).click();
		
		Set<String> sessionIds = driver.getWindowHandles();
		
		sessionIds.remove(ParentId);
		
		
		for (String childId: sessionIds) {
			driver.switchTo().window(childId);
			
//			String id = driver.getWindowHandle();
//			
//			String title = driver.getTitle();
			
			driver.manage().window().maximize();
			
			Thread.sleep(5000);
			
//			System.out.println(title +"----->"+id);
			
			driver.manage().window().minimize();
			
			driver.close();
		}
		
		System.out.println("Parent session id  --->"+ParentId);
		
		System.out.println("sessionid ----->"+sessionIds);
		
		
		driver.quit();
	}

}
