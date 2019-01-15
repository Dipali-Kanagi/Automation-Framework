package generic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class SeleniumBase {

	WebDriver driver;
	enum locator{id,name,className,tagName,linkText,partialLinkText,xpath,css};
	public void launchApplication(String browserName, String url) {
		
		if(browserName.equalsIgnoreCase("chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "D:\\Apps\\eclipse-java-2018-09-win32-x86_64\\projects\\pom_automation_framework\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
			
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "D:\\Apps\\eclipse-java-2018-09-win32-x86_64\\projects\\pom_automation_framework\\drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("ie")) {
			System.setProperty("webdriver.ie.driver", "D:\\Apps\\eclipse-java-2018-09-win32-x86_64\\projects\\pom_automation_framework\\drivers\\IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
	}
	public static void main(String args[]) {
		SeleniumBase sb = new SeleniumBase();
		sb.launchApplication("chrome", "http://naukri.com");
		//sb.closeapplicaiton(true);
	}
	public void closeapplicaiton(boolean flag) {
		if(flag) {
		driver.quit();
		}
		else {
			driver.close();

		}
	}
	public WebElement identifyElement(String address, locator type) {
		 By by = null;
		switch(type) {
		case id:by = By.id(address);
		break;
		case className: by = By.className(address);
		break;
		case css: by = By.cssSelector(address);
		break;
		case linkText : by = By.linkText(address);
		break;
		case partialLinkText : by =By.partialLinkText(address);
		break;
		case xpath : by = By.xpath(address);
		break;
		case name : by = By.name(address);
		break;
		case tagName : by = By.tagName(address);
		break;
		
		}
		return driver.findElement(by);
				
	}
	public List<WebElement> identifyElements(String address, locator type) {
		 By by = null;
		switch(type) {
		case id:by = By.id(address);
		break;
		case className: by = By.className(address);
		break;
		case css: by = By.cssSelector(address);
		break;
		case linkText : by = By.linkText(address);
		break;
		case partialLinkText : by =By.partialLinkText(address);
		break;
		case xpath : by = By.xpath(address);
		break;
		case name : by = By.name(address);
		break;
		case tagName : by = By.tagName(address);
		break;
		
		}
		return driver.findElements(by);
				
	}
	
}
