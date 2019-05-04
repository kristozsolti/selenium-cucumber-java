package stepdefinitions.loggedin;

import static org.junit.Assert.assertTrue;

import com.mylibrary.helper.UrlCollection;
import com.mylibrary.pageobjects.common.MenuBar;
import com.mylibrary.pages.Pages;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UsersPageStepDefinition {
	
//	Scenario1
	@Given("MyLibrary application homepage after authentication")
	public void mylibrary_application_homepage_after_authentication() {
	    Pages.loginPage().loginAsUser();
	}

	@When("I click on users link")
	public void i_click_on_users_link() {
	    MenuBar.clickOnUsersLink();
	}

	@Then("I should be redirected to users page")
	public void i_should_be_redirected_to_users_page() {
	   assertTrue(Pages.usersPage().isAt(UrlCollection.USERS_PAGE));
	}
	
}
