package stepdef;

import cucumber.api.java.en.*;
import generic.SeleniumBase;

public class HomeStepDef extends SeleniumBase{
	
	@Given("user has launched {string} browser and url is {string}")
	public void user_has_launched_browser_and_url_is(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		super.launchApplication(string, string2);
	}

	@Then("user can close browser")
	public void user_can_close_browser() {
	    // Write code here that turns the phrase above into concrete actions
	   super.closeapplicaiton(false);
	}


}
