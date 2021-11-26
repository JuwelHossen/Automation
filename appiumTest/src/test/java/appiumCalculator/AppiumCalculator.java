package appiumCalculator;

import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class AppiumCalculator 
{
	
	static AppiumDriver <MobileElement> driver;
	public static void openCalculator() throws Exception
	{
		DesiredCapabilities cap = new 	DesiredCapabilities();
		
		cap.setCapability("deviceName", "Motog");
		cap.setCapability("udid", "ZY323W7MM7");
		cap.setCapability("platformName", "Android");
		cap.setCapability("platformVersion", "9");
		cap.setCapability("appPackage", "com.google.android.calculator");
		cap.setCapability("appActivity", "com.android.calculator2.Calculator");
		
		URL url = new URL("http://127.0.0.1:4723/wd/hub");
		driver= new AppiumDriver<MobileElement>(url,cap);
		System.out.println("Application is started ........");
		
		MobileElement two= driver.findElement(By.id("com.google.android.calculator:id/digit_2"));
		MobileElement seven= driver.findElement(By.id("com.google.android.calculator:id/digit_7"));
		MobileElement plus= driver.findElement(By.id("com.google.android.calculator:id/op_add"));
		MobileElement equal= driver.findElement(By.id("com.google.android.calculator:id/eq"));
		
		two.click();
		plus.click();
		seven.click();
		equal.click();
		
	}
	
	
	//main method
	
	public static void main(String []args)
	{
		try {
			openCalculator() ;
			
		}catch(Exception e)
		{
			e.getCause();
			e.getMessage();
			e.fillInStackTrace();
		}
	}

}
