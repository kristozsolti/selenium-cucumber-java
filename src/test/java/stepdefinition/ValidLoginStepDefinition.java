package stepdefinition;



import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ValidLoginStepDefinition {
	
	private static final String BASE_URL = "https://my-library-example.herokuapp.com/";
	private String USERNAME = "admin@test.com";
//	private String PASSWORD = "admin";
	protected WebDriver driver;
//	private WebDriverWait wait;

	@Before
	public void init() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
//		wait = new WebDriverWait(driver, 10); 
		System.out.println("Initializing browser driver VALID LOGIN");
	}

	@Given("^Application Login screen$")
	public void application_login_screen() throws Throwable {
		driver.get(BASE_URL + "/login");
		System.out.println("Open " + BASE_URL);
	}

	@When("^I enter my ([^\"]*) and ([^\"]*)$")
	public void i_enter_my_credentials(String username, String password) throws Throwable {
		WebElement userNameField = driver.findElement(By.id("username"));
		userNameField.sendKeys(username);
		USERNAME = username;
		
		WebElement passwordField = driver.findElement(By.id("password"));
		passwordField.sendKeys(password);
//		PASSWORD = password;
		
		System.out.println("Entering credentials to the input boxes");
	}

	@And("^Click to login button$")
	public void click_to_login_button() throws Throwable {
		driver.findElement(By.xpath("//form/div/button")).click();
		System.out.println("Click to login button");
	}

	@Then("^I Should be authenticated$")
	public void i_should_be_authenticated() throws Throwable {
		String userName = driver.findElement(By.xpath("//*[@id='dropdownMenu']/span")).getText();
		assertEquals(userName, USERNAME);
		System.out.println("Is the user authenticated? -> " + userName.equals(USERNAME) );
	}
	
	@After
	public void close() {
		driver.close();
//		driver.quit();
		System.out.println("Closing the browser");
	}

}
