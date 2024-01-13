package awesomecucumber.hooks;

import org.openqa.selenium.WebDriver;

import awesomecucumber.context.TestContext;
import awesomecucumber.factory.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.messages.types.Scenario;

public class MyHooks {
	private WebDriver driver;
	private final TestContext context;
	
	public MyHooks(TestContext context) {
		this.context = context;
	}
	
	
	@Before
	public void before(Scenario scenario) {
		System.out.println("BEFORE: THREAD ID:" + Thread.currentThread().getId() + "," + "SCENARIO NAME: " + scenario.getName());
		driver = DriverFactory.initializeDriver(System.getProperty("browser","chrome"));	
		context.driver = driver;
	}
	
	@After
	public void after(Scenario scenario) {
		System.out.println("AFTER: THREAD ID:" + Thread.currentThread().getId() + "," + "SCENARIO NAME: " + scenario.getName());
		driver.quit();
	}
	
}
