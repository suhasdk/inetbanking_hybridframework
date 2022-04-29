package com.vandvtechsolution.inetbanking.testbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

import com.vandvtechsolution.inetbanking.utility.ConfigDataProvider;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase {

	public WebDriver driver;
	static String configdatapath = "./config/config.properties";

	public ConfigDataProvider configDataProvider;

	@BeforeSuite
	public void init() {
		configDataProvider = new ConfigDataProvider(configdatapath);

	}

	@BeforeTest
	@Parameters({"browser"})
	public void setup(@Optional("Chrome")String brName) {
		
		if(brName.equals("Chrome"))
		{
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
		}
		else if (brName.equals("firfox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			
		}
		else
		{
			System.out.println("browser not mstched pls check with expected browser");
		}
		driver.manage().window().maximize();
		driver.get(configDataProvider.getURL());
		
		}

	@AfterTest
	public void tearDown() {

		driver.quit();

	}

}
