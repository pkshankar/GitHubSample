package tests;

import org.testng.annotations.Test;

//import pages.LoginPage;

public class LoginPageTest {

	String name = "Shankar";
	String pw = "pwd";
	int age = 35;
	String city = "city1";

//	LoginPage loginPage = new LoginPage();

	@Test
	public void loginPageTitle() {

//		loginPage.getLoginPageTitle();

		System.out.println("Login Page Test - Title");
	}

	@Test
	public void loginPageSuccessfulLogin() {

		System.out.println("Login Page Test - Successful Login");
	}

	@Test
	public void anotherTest() {

		System.out.println("Login Page Test - Another Test");
	}

}
