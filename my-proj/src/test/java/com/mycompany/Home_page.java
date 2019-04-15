package com.mycompany;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import academy.Base;
import pageObjects.LandingPage;
import pageObjects.LoginPage;

public class Home_page extends Base {
	public static Logger log=LogManager.getLogger(Home_page.class.getName());
	@BeforeMethod
	public void main_login() throws IOException {
		driver = initalize();
		// driver.get("https://www.google.com/");
		driver.get(prop.getProperty("url"));
	}

	@Test(dataProvider = "getData")
	public void basepagenavigation(String username, String password) throws IOException {

		LandingPage lp = new LandingPage(driver);
		lp.login().click();

		Login_Page login = new Login_Page(driver);
		login.username().sendKeys(username);
		login.pasword().sendKeys(password);
		login.submt().click();
		log.info("enetered uname, pswrd and clicked");

	}

	@DataProvider
	public Object[][] getData() {
		// rows stands for how many diferent data types test should run
		// column stands for how many values for each test
		Object[][] data = new Object[2][2];
		data[0][0] = "no_restrict@gmail.com";
		data[0][1] = "123456";

		data[1][0] = "restrict@gmail.com";
		data[1][1] = "45552";
		return data;
	}

	@AfterMethod
	public void teardown() {
		driver.close();
		driver=null;
	}

}
