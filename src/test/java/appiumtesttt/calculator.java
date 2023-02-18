package appiumtesttt;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class calculator {

	//WebDriver driver;
	static AppiumDriver driver;
	public static void main(String[] args) throws MalformedURLException {
		calculators();
		
	}
	public static void calculators() throws MalformedURLException {    
		
		DesiredCapabilities cap=new DesiredCapabilities(); 
		 
		
		cap.setCapability("deviceName", "Infinix X695");
		cap.setCapability("udid", "067682516J100808");
		cap.setCapability("platformName", "Android ");
		cap.setCapability("platformVersion", "11");
		cap.setCapability("appPackage", "com.transsion.calculator");
		cap.setCapability("appActivity", "com.transsion.calculator.Calculator");
		cap.setCapability("automationName", "UiAutomator2");
		cap.setCapability("app", "C:\\Users\\Hassan\\Downloads");
		URL url=new URL("http://127.0.0.1:4723/wd/hub");
		AppiumDriver driver = new AppiumDriver(url, cap);
		//String sessionId=driver.getSessionId().toString();


	}

}
