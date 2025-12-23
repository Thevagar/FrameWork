package popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FileUpload {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");
		
		Actions act=new Actions(driver);
		
		act.scrollByAmount(0, 500).perform();
		WebElement exBtn = driver.findElement(By.xpath("//div[@class='textWrap']"));
		exBtn.click();
		
		WebElement fileUpload = driver.findElement(By.id("resumeUpload"));
		
		fileUpload.sendKeys("C:\\Users\\asus\\Documents\\Spring-5.pdf");
		

	}

}
