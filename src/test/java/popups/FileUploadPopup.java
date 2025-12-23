package popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.naukri.com/registration/createAccount?othersrcp=22636");

		WebElement experience = driver.findElement(By.xpath("//div[@data-val='exp']"));
		experience.click();

		WebElement upload = driver.findElement(By.id("resumeUpload"));

		upload.sendKeys("C:\\Users\\asus\\Documents\\selenium\\Spring-10.pdf");
	}

}
