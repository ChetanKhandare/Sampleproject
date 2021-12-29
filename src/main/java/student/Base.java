package student;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {


		public ChromeDriver driver;
		public Properties pr;

		@BeforeMethod
		public void init() throws IOException {
			System.setProperty("webdriver.chrome.driver", "../Car/chromedriver.exe");
			driver = new ChromeDriver();
			File f = new File("../Practiceproject/obj.properties");
			driver.get("https://www.facebook.com");
			FileInputStream fr = new FileInputStream(f);
			pr = new Properties();
			pr.load(fr);
			
			
		}
		@AfterMethod
		public void close()
		{
			driver.close();
			
		

		
	}

}
