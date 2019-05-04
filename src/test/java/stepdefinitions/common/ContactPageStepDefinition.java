package stepdefinitions.common;

import static org.junit.Assert.assertTrue;

import com.mylibrary.pageobjects.common.ContactPage;
import com.mylibrary.pageobjects.common.HomePage;
import com.mylibrary.pageobjects.common.MenuBar;
import com.mylibrary.pages.Pages;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ContactPageStepDefinition {

	@Given("^MyLibrary homepage$")
	public void myLibraryHomePage() throws Throwable {
		Pages.homePage().goTo();
	}

	@When("^I click on Contact us link at the menubar$")
	public void iClickOnContactUsLink() throws Throwable {
		MenuBar.clickOnContactLink();
	}

	@Then("^I should be redirected to contact page$")
	public void iShouldBeRedirectedToContactPage() throws Throwable {
		assertTrue(Pages.contactPage().isAt());
	}

}
