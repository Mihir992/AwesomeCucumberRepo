package awesomecucumber.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import awesomecucumber.domainobjects.BillingDetails;

public class CheckoutPage extends BasePage {

	public CheckoutPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//input[@id='guestFrm_firstname']")
	private WebElement billingFirstNameFld;
	
	@FindBy(xpath="//input[@id='guestFrm_lastname']")
	private WebElement billingLastNameFld;
	
	//@FindBy(xpath="//select[@id='guestFrm_country_id']")
	//private WebElement countryDropdownFld;
	
	@FindBy(xpath="//input[@id='guestFrm_email']")
	private WebElement inputEmailFld;
	
	@FindBy(xpath="//input[@id='guestFrm_address_1']")
	private WebElement inputAddressFld;
	
	@FindBy(xpath="//input[@id='guestFrm_city']")
	private WebElement inputCityFld;
	
	@FindBy(xpath="//select[@id='guestFrm_zone_id']")
	private WebElement billingstateDropdownFld;
	
	@FindBy(xpath="//input[@id='guestFrm_postcode']")
	private WebElement inputZipCodeFld;
	
	@FindBy(xpath="//button[@title='Continue']")
	private WebElement continueBtn;
	
	@FindBy(xpath="//button[@id='checkout_btn']")
	private WebElement confirmOrderBtn;
	
	@FindBy(xpath="//span[text()=' Your Order Has Been Processed!']")
	private WebElement noticeTxt;
	
	public CheckoutPage enterbillingFirstName(String billingFirstName) {
		WebElement e = wait.until(ExpectedConditions.visibilityOf(billingFirstNameFld));
		e.clear();
		e.sendKeys(billingFirstName);
		return this;
	}
	
	public CheckoutPage enterbillingLastName(String billingLastName) {
		WebElement e = wait.until(ExpectedConditions.visibilityOf(billingLastNameFld));
		e.clear();
		e.sendKeys(billingLastName);
		return this;
	}

	public CheckoutPage enterEmail(String email) {
		WebElement e = wait.until(ExpectedConditions.visibilityOf(inputEmailFld));
		e.clear();
		e.sendKeys(email);
		return this;
	}
	
	public CheckoutPage enterAddressLine(String address) {
		WebElement e = wait.until(ExpectedConditions.visibilityOf(inputAddressFld));
		e.clear();
		e.sendKeys(address);
		return this;
	}
	
	public CheckoutPage enterCity(String city) {
		WebElement e = wait.until(ExpectedConditions.visibilityOf(inputCityFld));
		e.clear();
		e.sendKeys(city);
		return this;
	}
	
	public CheckoutPage selectBillingState(String state) {
		Select select = new Select(wait.until(ExpectedConditions.visibilityOf(billingstateDropdownFld)));
		select.selectByVisibleText(state);
		return this;
	}
	
	public CheckoutPage enterZipcode(String zipcode) {
		WebElement e = wait.until(ExpectedConditions.visibilityOf(inputZipCodeFld));
		e.clear();
		e.sendKeys(zipcode);
		return this;
	}
	
	public CheckoutPage setBillingDetails(BillingDetails billingDetails) {
		return  enterbillingFirstName(billingDetails.getBillingFirstName()).
				enterbillingLastName(billingDetails.getBillingLastName()).
				enterEmail(billingDetails.getBillingEmail()).
				enterAddressLine(billingDetails.getBillingAddressline()).
				enterCity(billingDetails.getBillingCity()).
				selectBillingState(billingDetails.getBillingState()).
				enterZipcode(billingDetails.getBillingZip());	
	}
	
	public CheckoutPage placeOrder() {
		wait.until(ExpectedConditions.elementToBeClickable(continueBtn)).click();
		wait.until(ExpectedConditions.elementToBeClickable(confirmOrderBtn)).click();
		//wait.until(ExpectedConditions.visibilityOf(continueButton)).click();
		return this;
	}
	
	public String getNotice() {
		return wait.until(ExpectedConditions.visibilityOf(noticeTxt)).getText();
	}
	
}
