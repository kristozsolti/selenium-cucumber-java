package stepdefinition;



import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class InvalidLoginStepDefinition {
	
	private static final String BASE_URL = "https://my-library-example.herokuapp.com/";
	private String USERNAME = "invalid_email@ex.com";
	private String PASSWORD = "randompassword";
	private String ERROR_MSG = "Check your username and password and try again.";
	protected WebDriver driver;
	private WebDriverWait wait;

	@Before
	public void init() {
		driver = new ChromeDriver();
//		driver.manage().window().maximize();
		wait = new WebDriverWait(driver, 10); 
		System.out.println("Initializing browser driver INVALID LOGIN");
	}

	@Given("^Application Login screen when invalid$")
	public void application_login_screen() throws Throwable {
		driver.get(BASE_URL + "/login");
		System.out.println("Open " + BASE_URL);
	}

	@When("^I enter wrong credentials$")
	public void i_enter_wrong_credentials() throws Throwable {
		WebElement userNameField = driver.findElement(By.id("username"));
		userNameField.sendKeys(USERNAME);
		
		WebElement passwordField = driver.findElement(By.id("password"));
		passwordField.sendKeys(PASSWORD);
		
		System.out.println("Entering credentials to the input boxes");
	}

	@And("^Click to login button when invalid$")
	public void click_to_login_button() throws Throwable {
		 wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//form/div/button"))).click();
		System.out.println("Click to login button");
	}

	@Then("^I Should not be authenticated and get error message$")
	public void i_should_not_be_authenticated_and_get_error() throws Throwable {
		String errorMessage = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@class='alert alert-danger']/p"))).getText();
		assertEquals(errorMessage, ERROR_MSG);
		System.out.println("Is the error message appeared? -> " + errorMessage.equals(ERROR_MSG) );
	}
	
	@After
	public void close() {
		driver.close();
//		driver.quit();
		System.out.println("Closing the browser");
	}

}
