package basic;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Setup {
	
	public static WebDriver driver;
	
	public static void init()
	{
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless"); // Run Chrome in headless mode
        options.addArguments("--no-sandbox"); // Bypass OS security model
        options.addArguments("--disable-dev-shm-usage"); // Fix session not created: This version of ChromeDriver only supports Chrome version XX error
     
        try {
			driver = new RemoteWebDriver(new URL("172.25.0.3"),options);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
