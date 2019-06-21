package com.mylibrary.testframework.pageobjects.authenticated;

import com.mylibrary.testframework.driver.Browser;
import com.mylibrary.testframework.helper.UrlCollection;
import com.mylibrary.testframework.pages.Page;

public class UserSettingsPage extends Page {

	@Override
	public void goTo() {
		Browser.goTo(pagePath());
		
	}

	@Override
	public String pagePath() {
		return UrlCollection.USER_SETTINGS_PAGE;
	}

}
