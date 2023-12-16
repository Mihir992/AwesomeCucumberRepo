import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import com.sun.tools.javac.util.List;

import awesomecucumber.domainobjects.BillingDetails;
import awesomecucumber.domainobjects.Product;
import awesomecucumber.factory.DriverFactory;
import awesomecucumber.pages.Cartpage;
import awesomecucumber.pages.CheckoutPage;
import awesomecucumber.pages.StorePage;
import awesomecucumber.utils.ConfigLoader;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class MyStepDefinitions {
	private WebDriver driver;
	private BillingDetails billingdetails;
	//private Product product;
	
	@Given("I'm on Store page")
	public void iMOnStorePage() {
		driver = DriverFactory.getDriver();
		new StorePage(driver).load();
	}
	
	@When("I add a {product} to the cart")
	public void iAddToTheCart(Product product) throws InterruptedException {
		new StorePage(driver).addToCart(product.getName());
	}
	
	@Then("I should see {int} {product} in the cart")
	public void iShouldSeeInTheCart(int quantity,Product product) {
		Cartpage cartPage = new Cartpage(driver);
		cartPage.viewCartLink();
		Assert.assertEquals(product.getName(), cartPage.getProductName());
		Assert.assertEquals(quantity, cartPage.getProductQuantity());
	}
	
	@Given("I'm a guest customer")
	public void iMAGuestCustomer() {
		driver = DriverFactory.getDriver();
		new StorePage(driver).load();
	}
	
	@And("I have a product in the cart")
	public void iHaveAProductInTheCart() {
		new Cartpage(driver).viewCartLink();
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
