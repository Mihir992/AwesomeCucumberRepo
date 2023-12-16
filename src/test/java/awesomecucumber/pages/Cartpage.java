package awesomecucumber.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Cartpage extends BasePage{

	@FindBy(xpath="//div[@class='block_7']/ul/li/a/i[@class='fa fa-shopping-cart fa-fw']")
	private WebElement viewCartLink;
	
	@FindBy(css = "#cart > div > div.container-fluid.cart-info.product-list > table > tbody > tr:nth-child(2) > td:nth-child(2) a")
	private WebElement productNameFld;
	
	@FindBy(xpath = "//div[@class='input-group input-group-sm']/input[@type='text']")
	private WebElement productQuantityFld;
	
	@FindBy(xpath = "//div[@class='pull-right mb20']/a[@title='Checkout']")
	private WebElement proceedToCheckoutBtn;
	
	@FindBy(xpath = "//input[@id='accountFrm_accountguest']")
	private WebElement clickOnGuestCheckout;
	
	@FindBy(xpath = "//button[@title='Continue']")
	private WebElement clickOnContinueBtn;
	
	
	public Cartpage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void viewCartLink() {
		wait.until(ExpectedConditions.elementToBeClickable(viewCartLink)).click();
	}
	
	public String getProductName() {
		return wait.until(ExpectedConditions.visibilityOf(productNameFld)).getText();
	}

	public int getProductQuantity() {
		return Integer.parseInt(wait.until(ExpectedConditions.visibilityOf(productQuantityFld)).getAttribute("value"));
	}
	
	public void checkout() {
		wait.until(ExpectedConditions.visibilityOf(proceedToCheckoutBtn)).click();
		wait.until(ExpectedConditions.visibilityOf(clickOnGuestCheckout)).click();
		wait.until(ExpectedConditions.visibilityOf(clickOnContinueBtn)).click();
	}
}
