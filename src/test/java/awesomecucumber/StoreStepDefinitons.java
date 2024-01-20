package awesomecucumber.stepdefinitions;

import org.openqa.selenium.WebDriver;

import awesomecucumber.context.TestContext;
import awesomecucumber.domainobjects.Product;
import awesomecucumber.pages.Cartpage;
import awesomecucumber.pages.StorePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class StoreStepDefinitons {
	
	private final WebDriver driver;
	
	public StoreStepDefinitons(TestContext context) {
		driver = context.driver;
	}
	
	@Given("I'm on Store page")
	public void iMOnStorePage() {
		new StorePage(driver).load();
	}
	
	@When("I add a {product} to the cart")
	public void iAddToTheCart(Product product) throws InterruptedException {
		new StorePage(driver).addToCart(product.getName());
	}
	
	@And("I have a product in the cart")
	public void iHaveAProductInTheCart() {
		new Cartpage(driver).viewCartLink();
	}
}
