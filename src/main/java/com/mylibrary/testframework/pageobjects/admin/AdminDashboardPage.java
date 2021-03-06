package com.mylibrary.testframework.pageobjects.admin;

import com.mylibrary.testframework.driver.Browser;
import com.mylibrary.testframework.helper.UrlCollection;
import com.mylibrary.testframework.pages.Page;

public class AdminDashboardPage extends Page {

	@Override
	public void goTo() {
		Browser.goTo(pagePath());
	}

	@Override
	public String pagePath() {
		return UrlCollection.ADMIN_DASHBOARD_PAPGE_URL;
	}

}
