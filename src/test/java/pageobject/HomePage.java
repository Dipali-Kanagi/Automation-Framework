package pageobject;

import java.util.List;

import org.openqa.selenium.WebElement;

import generic.SeleniumBase;

public class HomePage extends SeleniumBase {
 
	String	tagNameHomePageLinks = "a";
	private List<WebElement> getAllLinks() {
		return super.identifyElements(tagNameHomePageLinks, locator.tagName);
		
		
	}
	public int getCountOfAllLinks() {
		return this.getAllLinks().size();
		
	}
	
}
