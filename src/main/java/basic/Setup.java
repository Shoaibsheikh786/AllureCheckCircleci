package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Setup {
	
	public static WebDriver driver;
	
	public static void init()
	{
		ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless"); // Run Chrome in headless mode
        options.addArguments("--no-sandbox"); // Bypass OS security model
        options.addArguments("--disable-dev-shm-usage"); // Fix session not created: This version of ChromeDriver only supports Chrome version XX error
        driver = new ChromeDriver(options);
	}

}
