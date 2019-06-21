package com.mylibrary.testframework.pageobjects.authenticated;

import com.mylibrary.testframework.driver.Browser;
import com.mylibrary.testframework.helper.UrlCollection;
import com.mylibrary.testframework.pages.Page;

public class UserDetailsPage extends Page {
	private static final String USER_EMAIL_ID = "user-email";

	public Boolean isAtUserDetailPage(String userEmail) {
		String email = super.getElementTextById(USER_EMAIL_ID);
		return userEmail.equals(email);
	}

	@Override
	public void goTo() {
		Browser.goTo(pagePath());
	}

	@Override
	public String pagePath() {
		return UrlCollection.USERS_PAGE + "/1";
	}

}
