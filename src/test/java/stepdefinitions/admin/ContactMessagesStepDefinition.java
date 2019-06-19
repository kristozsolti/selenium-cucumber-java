package stepdefinitions.admin;

import static org.junit.Assert.assertTrue;

import com.mylibrary.testframework.helper.UrlCollection;
import com.mylibrary.testframework.pageobjects.common.MenuBar;
import com.mylibrary.testframework.pages.Pages;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ContactMessagesStepDefinition {
	private String messageLink = "";
	
//	Scenario1
    @When("I go to contact messages page")
    public void i_go_to_contact_messages_page() {
    	Pages.contactMessagesPage().goTo();
    }
    
    @Then("I should be redirected to the contact messages inbox page")
    public void i_should_be_redirected_to_the_contact_messages_page() {
    	Pages.contactMessagesPage().isAt(UrlCollection.ADMIN_CONTACT_PAPGE_URL);
    	MenuBar.performSignOut();
    }
    
//    Scenario2
    @And("I click on Open Message button at the first message")
    public void i_click_on_open_message_button_at_first_message() {
    	messageLink = Pages.contactMessagesPage().clickOnFirstOpenMessageButton();
    }
    
    @Then("I should be redirected to the message page")
    public void i_should_be_redirected_to_the_message_page() {
    	assertTrue(Pages.contactMessagesPage().isAtContactMessage(messageLink));
    	MenuBar.performSignOut();
    }
    
//    Scenario3
    @And("Click on delete button")
    public void click_on_delete_button() {
    	Pages.contactMessagesPage().clickOnDeleteMessageButton();
    }
    
    @Then("The message should be deleted")
    public void the_message_should_be_deleted() {
    	assertTrue(Pages.contactMessagesPage().isMessageDeleted(messageLink));
    }
    
    @And("I should be redirected to the messages inbox page")
    public void i_should_be_redirected_to_the_inbox_page() {
    	assertTrue(Pages.contactMessagesPage().isAt(UrlCollection.ADMIN_CONTACT_PAPGE_URL));
    	MenuBar.performSignOut();
    }
}
