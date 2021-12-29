package org.testing.TestScripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testing.utilities.Screenshotcapture;
import org.testng.annotations.Test;

import student.Base;

public class TC1 extends Base {
	
	@Test   // Select TestNG annotation
	public void testCase1() throws IOException
	{
		
		WebElement login=driver.findElement(By.xpath(pr.getProperty("Login")));
		login.click();
		
		Screenshotcapture.takeScreenshot(driver, "D:\\Screenshot\\fb.png");
	}
	
	

}
