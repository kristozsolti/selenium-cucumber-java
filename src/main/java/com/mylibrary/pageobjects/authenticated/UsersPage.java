package com.mylibrary.pageobjects.authenticated;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.mylibrary.driver.Browser;
import com.mylibrary.helper.UrlCollection;
import com.mylibrary.pages.Page;

public class UsersPage extends Page {

	@Override
	public void goTo() {
		Browser.goTo(pagePath());
	}

	@Override
	public String pagePath() {
		return UrlCollection.USERS_PAGE;
	}

	public void searchFor(String name) {
		WebElement searchField = Browser.findById("search-user");
		searchField.sendKeys(name);
		
		clickOnSearchButton();
	}
	
	public void clickOnSearchButton() {
		WebElement searchButton = Browser.findById("search-button");
		searchButton.click();
	}

	public boolean isUserPresentAtSearchList(String username, String searchBy) {
		List<WebElement> foundUsers = null; 
		
		if(searchBy.equals("email")){
			foundUsers = Browser.findAllById("user-email");
		} else if (searchBy.equals("username")) {
			foundUsers = Browser.findAllById("user-name");
		}
		List<String> foundUsersEmails = new ArrayList<>();
		
		for (WebElement element : foundUsers) {
			foundUsersEmails.add(element.getText());
		}
		
		return foundUsersEmails.contains(username);
	}

	public void searchBy(String searchBy) {
		Select searchBySelect = new Select(Browser.findById("searchBy"));
		
		searchBySelect.selectByValue(searchBy);
		clickOnSearchButton();
	}

	public void clickOnUserDetailsPage(String userEmail) {
		WebElement userDetailsLink = Browser.findByXpath("//*[text()[contains(.,'" + userEmail + "')]]/../../../../..//a");
		userDetailsLink.click();
	}

}
