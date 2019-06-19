package stepdefinitions.admin;

import static org.junit.Assert.assertTrue;

import com.mylibrary.testframework.helper.UrlCollection;
import com.mylibrary.testframework.pageobjects.common.MenuBar;
import com.mylibrary.testframework.pages.Pages;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AddNewAuthorPageStepDefinition {
	 private String authorName = "";
	 
//	Scenario1
    @When("I log in as admin")
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
    
//	Scenario2
   
    @Given("I go to add new author page")
    public void i_go_to_add_new_author_page() {
        Pages.addNewAuthorPage().goTo();
    }

    @Given("^Enter the author name (.*)$")
    public void enter_the_author_name(String authorName) {
        Pages.addNewAuthorPage().fillAuthorNameField(authorName);
        this.authorName = authorName;
    }

    @Given("^Enter the author birth date (.*)$")
    public void enter_the_author_birth_date(String birthDate) {
        Pages.addNewAuthorPage().fillAuthorBirthDateField(birthDate);
    }

    @Given("^Enter the author photo url (.*)$")
    public void enter_the_author_photo_url(String photoUrl) {
        Pages.addNewAuthorPage().fillAuthorPhotoUrlField(photoUrl);
    }

    @Given("Enter the author rating {double}")
    public void enter_the_author_rating(Double rating) {
        Pages.addNewAuthorPage().fillAuthorRatingField(rating);
    }

    @Given("^Enter the author biography (.*)$")
    public void enter_the_author_bio(String bio) {
        Pages.addNewAuthorPage().fillAuthorBioField(bio);
    }

    @Given("Click on Save author button")
    public void click_on_Save_author_button() {
        Pages.addNewAuthorPage().clickOnSaveAuthorButton();
    }

    @Then("The new author should appear on the author list")
    public void the_new_author_should_appear_on_the_author_list() {
       assertTrue(Pages.authorPage().isAuthorPresent(this.authorName));
       MenuBar.performSignOut();
    }

}
