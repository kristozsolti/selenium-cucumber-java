package com.mylibrary.testframework.pageobjects.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.mylibrary.testframework.driver.Browser;
import com.mylibrary.testframework.helper.UrlCollection;
import com.mylibrary.testframework.pages.Page;

public class ContactPage extends Page {

	@Override
	public void goTo() {
		Browser.goTo(UrlCollection.CONTACT_PAPGE_URL);	
	}

	public Boolean isAt() {
		return Browser.isAtUrl(UrlCollection.CONTACT_PAPGE_URL);
	}

	@Override
	public String pagePath() {
		return UrlCollection.CONTACT_PAPGE_URL;
	}

	public void fillContactForm(String name, String email, String message) {
		WebElement nameField = Browser.findById("fromName");
		nameField.sendKeys(name);
		
		WebElement emailField = Browser.findById("fromEmail");
		emailField.sendKeys(email);
		
		WebElement messageField = Browser.findById("message");
		messageField.sendKeys(message);
	}

	public void submitContactForm() {
		WebElement submitButton = Browser.findById("submit-form-btn");
		submitButton.click();
	}
	
	public Boolean isContactMessageSentSuccessfully() {
		WebElement feedbackMessageContainer = Browser.findById("success-message");
		String feedbackMessage = feedbackMessageContainer.findElement(By.xpath("//div[@id='success-message']/p")).getText();
		
		return feedbackMessage.equals(getSuccessMessage());
	}
	
	public String getSuccessMessage() {
		return "Thank you for your message. We will process your request as soon as possible.";
	}

}
