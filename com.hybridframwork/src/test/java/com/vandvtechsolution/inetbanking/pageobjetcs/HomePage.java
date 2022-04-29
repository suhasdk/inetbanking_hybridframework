package com.vandvtechsolution.inetbanking.pageobjetcs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

	WebDriver driver;

	public HomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	// Object repository HomePage Layer

	@FindBy(linkText = "New Customer")
	WebElement newCustomerLink;

	@FindBy(linkText = "Edit Customer")
	WebElement editcustomer_Link;

	@FindBy(linkText = "Delete Customer")
	WebElement deleteCustomer_Link;

	@FindBy(linkText = "New Account")
	WebElement newAccount_Link;

	@FindBy(linkText = "Log out")
	WebElement logout_Link;

	public NewCustomerPage clickonNewCustomerLink() {
		try {
			newCustomerLink.click();
			return new NewCustomerPage();
		} catch (Exception e) {
			e.printStackTrace();
			return null;

		}

	}

	public NewAccountPage clickonNewAccountLink() {
		try {
			newAccount_Link.click();
			return new NewAccountPage();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}

	public EditCustomerPage clickonEditCustomerLink() {
		try {
			editcustomer_Link.click();
			return new EditCustomerPage();

		} catch (Exception e) {
			e.printStackTrace();
			return null;

		}
	}

	public void clickonLogoutLink() {
		try {
			logout_Link.click();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
