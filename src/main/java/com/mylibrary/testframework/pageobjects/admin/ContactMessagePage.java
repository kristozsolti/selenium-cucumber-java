package com.mylibrary.testframework.pageobjects.admin;

import com.mylibrary.testframework.driver.Browser;
import com.mylibrary.testframework.helper.UrlCollection;
import com.mylibrary.testframework.pages.Page;

public class ContactMessagePage extends Page {
	private static final String DELETE_MESSAGE_BUTTON_ID = "delete-message-button";
	
	@Override
	public void goTo() {
		Browser.goTo(pagePath());
	}

	@Override
	public String pagePath() {
		return UrlCollection.ADMIN_CONTACT_PAPGE_URL + "/1";
	}

	
	public Boolean isAtContactMessage(String messageLink) {
		return Browser.isAtUrl(messageLink);
	}

	public void clickOnDeleteMessageButton() {
		super.clickOnElementById(DELETE_MESSAGE_BUTTON_ID);
	}
	
}
