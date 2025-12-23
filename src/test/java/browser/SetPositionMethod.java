package browser;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetPositionMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			WebDriver driver=new ChromeDriver();
//			driver.manage().window().maximize();
			driver.manage().window().setPosition(new Point(100, 150));

			driver.get("https://www.amazon.in/");
			
				}

}
