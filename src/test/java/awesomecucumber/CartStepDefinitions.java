package awesomecucumber.stepdefinitions;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import awesomecucumber.context.TestContext;
import awesomecucumber.domainobjects.Product;
import awesomecucumber.pages.Cartpage;
import io.cucumber.java.en.Then;

public class CartStepDefinitions {
	
	private final WebDriver driver;
	
	public CartStepDefinitions(TestContext context) {
		driver = context.driver;
	}
	
	@Then("I should see {int} {product} in the cart")
	public void iShouldSeeInTheCart(int quantity,Product product) {
		Cartpage cartPage = new Cartpage(driver);
		cartPage.viewCartLink();
		Assert.assertEquals(product.getName(), cartPage.getProductName());
		Assert.assertEquals(quantity, cartPage.getProductQuantity());
	}
}