package stepDefinations;

import org.testng.Assert;

import academy.Base;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.LandingPage;
import pageObjects.Login_Page;
import pageObjects.PortalHomePage;

public class StepDefinations extends Base{
	@Given("^Instalize browser with chrome$")
	public void instalize_browser_with_chrome() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver = initalize();
	   	}

	@Given("^Navigate to \"([^\"]*)\" site$")
	public void navigate_to_site(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		driver.get(arg1);
	  
	}

	@Given("^Click on login limnk in homepage to land on signin page$")
	public void click_on_login_limnk_in_homepage_to_land_on_signin_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		LandingPage lp = new LandingPage(driver);
		if(LandingPage lp).popupsize()>0) {
			lp.popup().click();
			
		}
	lp.login().click();
	}

	

    @When("^User enters (.+) and (.+) and login$")
    public void user_enters_and_and_login(String username, String password) throws Throwable {
       // throw new PendingException();
        Login_Page login = new Login_Page(driver);
		login.username().sendKeys(username);
		login.pasword().sendKeys(password);
		login.submt().click();
    }
	

	@Then("^Verify that user is ssuccessfully logged in$")
	public void verify_that_user_is_ssuccessfully_logged_in() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		PortalHomePage ph =new PortalHomePage(driver);
		Assert.assertTrue(ph.search().isDisplayed());
	    
	}
	@And("^close browsers$")
    public void close_browsers() throws Throwable {
        driver.quit();
    }

}
