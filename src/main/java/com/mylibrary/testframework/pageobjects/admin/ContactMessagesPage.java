package com.mylibrary.testframework.pageobjects.admin;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;

import com.mylibrary.testframework.driver.Browser;
import com.mylibrary.testframework.helper.UrlCollection;
import com.mylibrary.testframework.pages.Page;

public class ContactMessagesPage extends Page {
	private static final String OPEN_MESSAGE_BUTTON_XPATH = "//a[@class='btn btn-outline-primary']";

	@Override
	public void goTo() {
		Browser.goTo(pagePath());
	}

	@Override
	public String pagePath() {
		return UrlCollection.ADMIN_CONTACT_PAPGE_URL;
	}

	public String clickOnFirstOpenMessageButton() {
		String href = "";
		WebElement openMessageButton = Browser.findAllByXpath(OPEN_MESSAGE_BUTTON_XPATH).get(0);
		href = openMessageButton.getAttribute("href");
		openMessageButton.click();
		return href;
	}
	
	public Boolean isAtContactMessage(String messageLink) {
		return Browser.isAtUrl(messageLink);
	}

	public void clickOnDeleteMessageButton() {
		super.clickOnElementById("delete-message-button");
	}

	public boolean isMessageDeleted(String messageLink) {
		List<WebElement> contactMessages = Browser.findAllByXpath(OPEN_MESSAGE_BUTTON_XPATH);
		List<String> contactMessagesLinks = new ArrayList<>();
		
		for (WebElement element : contactMessages) {
			contactMessagesLinks.add(element.getAttribute("href"));
		}
		
		return !contactMessagesLinks.contains(messageLink);
	}
	
}
