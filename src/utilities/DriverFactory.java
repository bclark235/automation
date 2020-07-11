package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

//Class that uses sets up the WebDriver to use the correct browser driver
public class DriverFactory {
	
	//Method to return a webDriver
	public static WebDriver open(String browserType) {
		if(browserType.equalsIgnoreCase("firefox")) {		
			System.setProperty("webdriver.gecko.driver", "C:\\Software\\geckodriver.exe");
			return new FirefoxDriver();		
		}
		else if(browserType.equalsIgnoreCase("IE")) {
			System.setProperty("webdriver.ie.driver", "C:\\Software\\IEDriverServer.exe");
			return new InternetExplorerDriver();	
		}
		else {
			System.setProperty("webdriver.chrome.driver","C:\\Software\\chromedriver.exe" );
			return new ChromeDriver();		
		}
		
	}	

}
