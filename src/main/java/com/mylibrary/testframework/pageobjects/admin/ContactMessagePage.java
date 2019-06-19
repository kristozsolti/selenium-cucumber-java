package com.mylibrary.testframework.pageobjects.admin;

import com.mylibrary.testframework.driver.Browser;
import com.mylibrary.testframework.helper.UrlCollection;
import com.mylibrary.testframework.pages.Page;

public class ContactMessagePage extends Page {

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
		super.clickOnElementById("delete-message-button");
	}
	
}
