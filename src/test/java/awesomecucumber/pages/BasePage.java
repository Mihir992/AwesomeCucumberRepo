package awesomecucumber.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import awesomecucumber.utils.ConfigLoader;

public class BasePage {
	protected WebDriver driver;
	public BasePage(WebDriver driver) {
		this.driver = driver;
		wait = new WebDriverWait(driver,Duration.ofSeconds(5));
		PageFactory.initElements(driver, this);
	}
	protected WebDriverWait wait;
	
	public void load() {
		driver.get(ConfigLoader.getInstance().getBaseUrl());
	}
}
