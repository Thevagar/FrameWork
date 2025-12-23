package a3;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PropertiesFile {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		//step-1
		FileInputStream fis=new FileInputStream("./src/test/resources/commonData.properties");
		//step-2
		Properties pObj=new Properties();
		//step -3
		pObj.load(fis);
		//step-4
		String URL = pObj.getProperty("url");
		String USERNAME = pObj.getProperty("username");
		
		
		WebDriver driver=new ChromeDriver();
		
		driver.get(URL);
	}

}
