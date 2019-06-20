package com.mylibrary.testframework.pageobjects.authenticated;

import com.mylibrary.testframework.driver.Browser;
import com.mylibrary.testframework.pages.Page;

public class UserDetailsPage extends Page {

	public Boolean isAtUserDetailPage(String userEmail) {
		String email = Browser.findById("user-email").getText();
		return userEmail.equals(email);
	}

	@Override
	public void goTo() {
		Browser.goTo(pagePath());
	}

	@Override
	public String pagePath() {
		return null;
	}

}
