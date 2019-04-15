package stepDefinations;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class StepDefinations{
	@Given("^user is on netbanking login page$")
	public void user_is_on_netbanking_login_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("^user login into application with username \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void user_login_into_application_with_username_and_password(String arg1, String arg2) throws Throwable {
	    // Write code here that turns the    throw new PendingException();
		System.out.println("usename :"+arg1);
		System.out.println("pasword :"+arg2);
	
	}

	@Then("^home page is populated$")
	public void home_page_is_populated() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^cards displayed are \"([^\"]*)\"$")
	public void cards_displayed_are(String arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.out.println("log info :"+arg1);
	   
	}




}
