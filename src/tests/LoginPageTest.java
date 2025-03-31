package tests;

import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginPageTest {

	LoginPage loginPage = new LoginPage();

	@Test
	public void loginPageTitle() {

		loginPage.getLoginPageTitle();

		System.out.println("Login Page Test - Title");
	}

}
