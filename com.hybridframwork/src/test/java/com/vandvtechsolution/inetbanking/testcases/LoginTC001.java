package com.vandvtechsolution.inetbanking.testcases;

import org.testng.annotations.Test;

import com.vandvtechsolution.inetbanking.pageobjetcs.LoginPage;
import com.vandvtechsolution.inetbanking.testbase.TestBase;

public class LoginTC001 extends TestBase {

//	@Test
//	public void verifyLoginFunctionalityTC001() {
//		LoginPage login = new LoginPage(driver);
//		login.setUsername("mngr341390");
//		login.SetPassword("vYmajuh");
//		login.clickonLoginBtn();
//
//	}
	
	@Test
	public void verifyLoginFunctionalityTC001() {
		LoginPage login = new LoginPage(driver);
		login.setUsername(configDataProvider.getusername());
		login.SetPassword(configDataProvider.getpwrd());
		login.clickonLoginBtn();

	}
}
