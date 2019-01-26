package pageobject;

import java.util.List;

import org.openqa.selenium.WebElement;

import generic.SeleniumBase;

public class HomePage extends SeleniumBase {
 
	String	tagNameHomePageLinks = "a";
	String linkTextHomePageLink = "%s";
	private List<WebElement> getAllLinks() {
		return super.identifyElements(tagNameHomePageLinks, locator.tagName);
		
		
	}
	public int getCountOfAllLinks() {
		return this.getAllLinks().size();
		
	}
	private WebElement getLink(String linkName)
	{
		 linkTextHomePageLink = String.format(linkTextHomePageLink, linkName);
		return super.identifyElement(this.linkTextHomePageLink, locator.linkText);

	}
	public void clickLink(String linkName)
	{
		super.performAction(actionType.click,this.getLink(linkName)); 
	}
	
}
