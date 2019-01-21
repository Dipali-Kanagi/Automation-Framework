package generic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SeleniumBase extends Base{

	WebDriver driver;

	protected enum locator {
		id, name, className, tagName, linkText, partialLinkText, xpath, css
	};

	public void launchApplication(String browserName, String url) {

		if (browserName.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					super.getAndConcatPath("\\drivers\\chromedriver.exe"));
			driver = new ChromeDriver();

		} else if (browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver",
					super.getAndConcatPath("\\drivers\\geckodriver.exe"));
			driver = new FirefoxDriver();
		} else if (browserName.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver",
					super.getAndConcatPath("\\drivers\\IEDriverServer.exe"));
			driver = new InternetExplorerDriver();
		}
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}

	public void closeapplicaiton(boolean flag) {
		if (flag) {
			driver.quit();
		} else {
			driver.close();

		}
	}
	public  String getPageDetails(String type) {
		String result= type;
		if(type.equalsIgnoreCase("currenturl")) {
			result = driver.getCurrentUrl();
			
		}
		return result;
	}
	

	public WebElement identifyElement(String address, locator type) {
		By by = null;
		switch (type) {
		case id:
			by = By.id(address);
			break;
		case className:
			by = By.className(address);
			break;
		case css:
			by = By.cssSelector(address);
			break;
		case linkText:
			by = By.linkText(address);
			break;
		case partialLinkText:
			by = By.partialLinkText(address);
			break;
		case xpath:
			by = By.xpath(address);
			break;
		case name:
			by = By.name(address);
			break;
		case tagName:
			by = By.tagName(address);
			break;

		}
		return driver.findElement(by);

	}

	public List<WebElement> identifyElements(String address, locator type) {
		By by = null;
		switch (type) {
		case id:
			by = By.id(address);
			break;
		case className:
			by = By.className(address);
			break;
		case css:
			by = By.cssSelector(address);
			break;
		case linkText:
			by = By.linkText(address);
			break;
		case partialLinkText:
			by = By.partialLinkText(address);
			break;
		case xpath:
			by = By.xpath(address);
			break;
		case name:
			by = By.name(address);
			break;
		case tagName:
			by = By.tagName(address);
			break;

		}
		return driver.findElements(by);

	}

}
