package awesomecucumber.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	//private static final ThreadLocal<WebDriver> driver = new ThreadLocal<>();
	
	public static WebDriver initializeDriver(String browser) {
		WebDriver driver;
		//WebDriverManager.chromedriver().setup();
		switch(browser) 
		{
			 case "chrome": {
				 WebDriverManager.chromedriver().setup();
				 driver = new ChromeDriver();
				 break;
			 }
			 case "firefox":{
				 WebDriverManager.firefoxdriver().setup();
				 driver = new FirefoxDriver();
				 break;
			 }
			 default:
				 throw new IllegalStateException("INVALID BROWSER: " + browser);
		}
		driver.manage().window().maximize();
		return driver;
	}
}
