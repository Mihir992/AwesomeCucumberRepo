package awesomecucumber.stepdefinitions;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import awesomecucumber.context.TestContext;
import awesomecucumber.domainobjects.BillingDetails;
import awesomecucumber.domainobjects.Product;
import awesomecucumber.factory.DriverFactory;
import awesomecucumber.pages.Cartpage;
import awesomecucumber.pages.CheckoutPage;
import awesomecucumber.pages.StorePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.opentelemetry.context.Context;

public class MyStepDefinitions {
	private WebDriver driver;
	
	//private Product product;
	
	public MyStepDefinitions(TestContext context) {
		driver = context.driver;
	}
	
	@Given("I'm a guest customer")
	public void iMAGuestCustomer() {
		new StorePage(driver).load();
	}
	
		
}