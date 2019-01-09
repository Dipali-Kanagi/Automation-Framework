package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumBase {

	WebDriver driver;
	
	public void launchApplication(String browserName, String url) {
		
		if(browserName.equalsIgnoreCase("chrome")) {
			
			System.setProperty("", "");
			driver = new ChromeDriver();
			
		}
		else if(browserName.equalsIgnoreCase("firefox")) {
			
		}
		else if(browserName.equalsIgnoreCase("ie")) {
			
		}
	}
	
}
