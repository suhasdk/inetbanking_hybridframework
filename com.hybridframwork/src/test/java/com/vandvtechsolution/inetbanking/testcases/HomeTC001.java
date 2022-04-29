package com.vandvtechsolution.inetbanking.testcases;

import org.testng.annotations.Test;

import com.vandvtechsolution.inetbanking.pageobjetcs.HomePage;
import com.vandvtechsolution.inetbanking.pageobjetcs.LoginPage;
import com.vandvtechsolution.inetbanking.testbase.TestBase;

public class HomeTC001 extends TestBase {
	
	HomePage homepage;
	
	@Test(priority=1)
	public void verifyLoginFunctionalityTC001() {
		LoginPage login = new LoginPage(driver);
		login.setUsername(configDataProvider.getusername());
		login.SetPassword(configDataProvider.getpwrd());
		homepage = login.clickonLoginBtn();

	}
   @Test(priority=2)
	public void navigateToEditCustomerPage()
	{
		homepage.clickonEditCustomerLink();
	}
}
