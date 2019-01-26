package stepdef;

import cucumber.api.java.en.*;
import generic.SeleniumBase;
import pageobject.HomePage;

public class HomeStepDef extends HomePage{
	
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
	@Then("verify page by {string} as  {string}")
	public void verify_page_by_as(String string, String expectedValue) {
	    // Write code here that turns the phrase above into concrete actions
		String actualValue = super.getPageDetails(string);
		super.compareValues(actualValue, expectedValue);
	}

	@Then("to verify the count of links on the home page is {int}")
	public void to_verify_the_count_of_links_on_the_home_page_is(Integer expectedCount) {
	    // Write code here that turns the phrase above into concrete actions
		 
		Integer actualValue = super.getCountOfAllLinks();
		super.compareValues(actualValue, expectedCount);
	}
	@Then("click on {string} link")
	public void click_on_link(String string) {
	    // Write code here that turns the phrase above into concrete actions
		super.clickLink(string);
	}



}
