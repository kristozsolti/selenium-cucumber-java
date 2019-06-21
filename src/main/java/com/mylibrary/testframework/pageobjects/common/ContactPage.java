package com.mylibrary.testframework.pageobjects.common;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.mylibrary.testframework.driver.Browser;
import com.mylibrary.testframework.helper.UrlCollection;
import com.mylibrary.testframework.pages.Page;

public class ContactPage extends Page {
	private static final String NAME_FIELD_ID = "fromName";
	private static final String EMAIL_FIELD_ID = "fromEmail";
	private static final String MESSAGE_FIELD_ID = "message";
	private static final String SEND_MESSAGE_BUTTON_ID = "submit-form-btn";
	private static final String SUCCESS_MESSAGE = "Thank you for your message. We will process your request as soon as possible.";
	
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
		super.fillInputFieldById(NAME_FIELD_ID, name);
		super.fillInputFieldById(EMAIL_FIELD_ID, email);
		super.fillInputFieldById(MESSAGE_FIELD_ID, message);
	}

	public void submitContactForm() {
		super.clickOnElementById(SEND_MESSAGE_BUTTON_ID);
	}
	
	public Boolean isContactMessageSentSuccessfully() {
		WebElement feedbackMessageContainer = Browser.findById("success-message");
		String feedbackMessage = feedbackMessageContainer.findElement(By.xpath("//div[@id='success-message']/p")).getText();
		
		return feedbackMessage.equals(getSuccessMessage());
	}
	
	public String getSuccessMessage() {
		return SUCCESS_MESSAGE;
	}

}
