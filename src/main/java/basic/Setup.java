package basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Setup {
	
	public static WebDriver driver;
	
	public static void init()
	{
		driver=new ChromeDriver();
	}

}
