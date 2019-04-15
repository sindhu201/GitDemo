package com.mycompany;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import academy.Base;

import pageObjects.LandingPage;


public class Validate_title extends Base{
	public static Logger log=LogManager.getLogger(Validate_title.class.getName());
	@BeforeMethod
	public void main_login() throws IOException {
		driver = initalize();
		log.info("driver is intialized");
		// driver.get("https://www.google.com/");
		driver.get(prop.getProperty("url"));
		log.info("navigated to homepage");
	}
	@Test
	public void basepagenavigation() throws IOException {
		
		LandingPage lp=new LandingPage(driver);
		String actua=lp.title_log().getText();
		Assert.assertEquals(actua, "FEATURED COURES");
		//System.out.println(lp.title_log().getText());
		//System.out.println(lp.navigate_log().isDisplayed());
		Assert.assertTrue(lp.navigate_log().isDisplayed(),"displayed");
		log.info("success");
	
	
	}
	@AfterMethod
	public void teardown() {	
		driver.close();
		driver=null;
	}
	

}
