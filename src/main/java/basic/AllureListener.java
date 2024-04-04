package basic;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.ITestListener;
import org.testng.ITestResult;

import io.qameta.allure.Attachment;

public class AllureListener extends Setup implements ITestListener {

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Screenshot taken");
		screenshot();
		
	}
	
	@Attachment(value="screenshots", type="image/png")
	public byte[] screenshot()
	{  
		 return  ((TakesScreenshot)driver).getScreenshotAs(OutputType.BYTES);
	}
	
	

}
