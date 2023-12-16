package awesomecucumber.factory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverFactory {
	private static WebDriver driver;
	
	public static WebDriver initializeDriver() {
		//WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chromer.driver","C:\\Users\\admin\\eclipseworkspace\\eCommerce\\Driver\\chromedriver.exe");
		/*ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifcations");
		options.addArguments("--disable-gpu");
		options.addArguments("--disable-extensions");
		options.addArguments("--no-sandbox");
		options.addArguments("--disable-dev-shm-usage");
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("https://www.google.com/");*/
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		return driver;
	}
	
	public static WebDriver getDriver() {
		return driver;
	}
}