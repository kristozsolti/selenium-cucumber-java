package stepdefinitions.admin;

import static org.junit.Assert.assertTrue;

import com.mylibrary.helper.UrlCollection;
import com.mylibrary.pageobjects.common.MenuBar;
import com.mylibrary.pages.Pages;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddNewAuthorPageStepDefinition {
	
//	Scenario1
    @When("I am logged in as admin")
    public void i_am_logged_in_as_admin() {
    	Pages.loginPage().loginAsAdmin();
    }
    
    @And("I go to authors page")
    public void i_go_to_authors_page() {
    	Pages.authorsPage().goTo();
    }
    
    @Then("Add new author button should be there")
    public void add_new_author_button_should_be_there() {
    	assertTrue(Pages.authorsPage().isAddNewAuthorButtonPresent());
    }
    
    @Then("If i click to add new author button")
    public void if_i_click_to_add_new_author_button() throws Throwable {
    	Pages.authorsPage().clickToAddNewAuthorButton();
    }
    
    @Then("I should be redirected to add new author page")
    public void i_should_be_redirected_to_add_new_author_page() {
    	assertTrue(Pages.addNewAuthorPage().isAt(UrlCollection.ADD_NEW_AUTHOR_PAGE));
    	MenuBar.performSignOut();
    }
	
}
