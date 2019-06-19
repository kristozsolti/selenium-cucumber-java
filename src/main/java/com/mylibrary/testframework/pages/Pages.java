package com.mylibrary.testframework.pages;

import com.mylibrary.testframework.pageobjects.admin.AddNewAuthorPage;
import com.mylibrary.testframework.pageobjects.admin.AddNewBookPage;
import com.mylibrary.testframework.pageobjects.admin.AdminDashboardPage;
import com.mylibrary.testframework.pageobjects.admin.ContactMessagesPage;
import com.mylibrary.testframework.pageobjects.authenticated.UserDetailsPage;
import com.mylibrary.testframework.pageobjects.authenticated.UsersPage;
import com.mylibrary.testframework.pageobjects.common.AuthorPage;
import com.mylibrary.testframework.pageobjects.common.AuthorsPage;
import com.mylibrary.testframework.pageobjects.common.BookPage;
import com.mylibrary.testframework.pageobjects.common.BooksPage;
import com.mylibrary.testframework.pageobjects.common.ContactPage;
import com.mylibrary.testframework.pageobjects.common.HomePage;
import com.mylibrary.testframework.pageobjects.common.LoginPage;
import com.mylibrary.testframework.pageobjects.common.RegistrationPage;

public class Pages {

	public static HomePage homePage() {
		HomePage homepage = new HomePage();
		return homepage;
	}

	public static ContactPage contactPage() {
		ContactPage contactPage = new ContactPage();
		return contactPage;
	}
	
	public static LoginPage loginPage() {
		LoginPage loginPage = new LoginPage();
		return loginPage;
	}
	
	public static BookPage bookPage() {
		BookPage bookPage = new BookPage();
		return bookPage;
	}

	public static BooksPage booksPage() {
		BooksPage booksPage = new BooksPage();
		return booksPage;
	}
	
	public static AuthorPage authorPage() {
		AuthorPage authorPage = new AuthorPage();
		return authorPage;
	}
	
	public static AuthorsPage authorsPage() {
		AuthorsPage authorsPage = new AuthorsPage();
		return authorsPage;
	}

	public static RegistrationPage registrationPage() {
		RegistrationPage registrationPage = new RegistrationPage();
		return registrationPage;
	}

	public static UsersPage usersPage() {
		UsersPage usersPage = new UsersPage();
		return usersPage;
	}

	public static UserDetailsPage userDetailsPage() {
		UserDetailsPage userDetailsPage = new UserDetailsPage();
		return userDetailsPage;
	}

	public static AddNewAuthorPage addNewAuthorPage() {
		AddNewAuthorPage addNewAuthorPage = new AddNewAuthorPage();
		return addNewAuthorPage;
	}

	public static AddNewBookPage addNewBookPage() {
		AddNewBookPage addNewBookPage = new AddNewBookPage();
		return addNewBookPage;
	}

	public static ContactMessagesPage contactMessagesPage() {
		ContactMessagesPage contactMessagesPage = new ContactMessagesPage();
		return contactMessagesPage;
	}

	public static AdminDashboardPage adminDashboardPage() {
		AdminDashboardPage adminDashboardPage = new AdminDashboardPage();
		return adminDashboardPage;
	}
}
