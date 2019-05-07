package stepdefinitions.admin;

import static org.junit.Assert.assertTrue;

import com.mylibrary.helper.UrlCollection;
import com.mylibrary.pageobjects.common.MenuBar;
import com.mylibrary.pages.Pages;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AdminDashboardStepDefinition {
	
//	Scenario1
    @When("I click on admin dashboard button on the menubar")
    public void i_click_on_admin_dashboard_button() {
    	MenuBar.clickOnAdminDashboardButton();
    }
    
    @Then("I should be redirected to the admin dashboard page")
    public void i_should_be_redirected_to_the_dashboard_page() {
    	assertTrue(Pages.adminDashboardPage().isAt(UrlCollection.ADMIN_DASHBOARD_PAPGE_URL));
    	MenuBar.performSignOut();
    }
	
}
