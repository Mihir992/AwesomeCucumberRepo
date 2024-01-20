package awesomecucumber.stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import awesomecucumber.context.TestContext;
import awesomecucumber.domainobjects.BillingDetails;
import awesomecucumber.pages.Cartpage;
import awesomecucumber.pages.CheckoutPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CheckoutStepDefinitions {
	
	private final WebDriver driver;
	private BillingDetails billingdetails;
	
	public CheckoutStepDefinitions(TestContext context) {
		driver = context.driver;
	}
	
	@And("I'm on the Checkout page")
	public void iMOnTheCheckoutPage() {
		new Cartpage(driver).checkout();
	}
	
	@When("I provide billing details")
	public void iProvideBillingDetails() {
		CheckoutPage checkoutPage = new CheckoutPage(driver);
		checkoutPage.setBillingDetails(billingdetails);
	}
	
	@And("I place an order")
	public void iPlaceAnOrder() {
		new CheckoutPage(driver).placeOrder();
	}
	
	@Then("the order should be placed successfully")
	public void theOrderShouldBePlacedSuccessfully() {
		Assert.assertEquals("' Your Order Has Been Processed!'", new CheckoutPage(driver).getNotice());
	}

}
