package com.mylibrary.pages;

import com.mylibrary.pageobjects.admin.AddNewAuthorPage;
import com.mylibrary.pageobjects.admin.AddNewBookPage;
import com.mylibrary.pageobjects.admin.AdminDashboardPage;
import com.mylibrary.pageobjects.admin.ContactMessagesPage;
import com.mylibrary.pageobjects.common.AuthorPage;
import com.mylibrary.pageobjects.common.AuthorsPage;
import com.mylibrary.pageobjects.common.BookPage;
import com.mylibrary.pageobjects.common.BooksPage;
import com.mylibrary.pageobjects.common.ContactPage;
import com.mylibrary.pageobjects.common.HomePage;
import com.mylibrary.pageobjects.common.LoginPage;
import com.mylibrary.pageobjects.common.RegistrationPage;
import com.mylibrary.pageobjects.loggedin.UserDetailsPage;
import com.mylibrary.pageobjects.loggedin.UsersPage;

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
