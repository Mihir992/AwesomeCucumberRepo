package awesomecucumber.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class StorePage extends BasePage{

	public StorePage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void addToCart(String productName) {
		By addToCartBtn = By.xpath("//a[@title='Add " + productName + " to Cart']");
		wait.until(ExpectedConditions.elementToBeClickable(addToCartBtn)).click();
	}
}