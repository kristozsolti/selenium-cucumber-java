package stepdefinitions.authenticated;

import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;

import com.mylibrary.testframework.helper.UrlCollection;
import com.mylibrary.testframework.pageobjects.common.MenuBar;
import com.mylibrary.testframework.pages.Pages;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class UsersPageStepDefinition {
	private String userEmail = "";
	
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
	
//	Scenario2
	@Given("MyLibrary Users page")
	public void mylibrary_Users_page() {
	    Pages.usersPage().goTo();
	}

	@When("I enter {string} to the search field")
	public void i_enter_to_the_search_field(String name) {
	    Pages.usersPage().searchFor(name);
	}
	
	@And("Select {string} at Search by dropdown list")
	public void select_at_search_by_dropdown_list(String searchBy) {
		Pages.usersPage().searchBy(searchBy);
	}

	@Then("The {string}, {string} should show up at the results")
	public void the_should_show_up_at_the_results(String username, String searchBy) {
	    assertTrue(Pages.usersPage().isUserPresentAtSearchList(username, searchBy));
	}
	
//	Scenario4
	
    @When("I clcik on {string} view details link")
    public void i_click_on_view_details_link(String userEmail) {
    	Pages.usersPage().clickOnUserDetailsPage(userEmail);
    	this.userEmail = userEmail;
    }
    
    @Then("I should be redirected to his details page")
    public void i_should_be_redirected_to_his_details_page() {
    	assertTrue(Pages.userDetailsPage().isAtUserDetailPage(userEmail));
    }

    @AfterClass
    public void signOut() {
    	MenuBar.performSignOut();
    }
}
