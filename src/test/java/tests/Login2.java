package tests;

import org.testng.annotations.Test;

import basic.Setup;

public class Login2 extends Setup {
	
	@Test
	public void test1()
	{
		init();
		driver.get("https://www.google.com/");
	
	}
	
	@Test
	public void test2()
	{
		init();
		driver.get("https://www.google.com/");
	
	}
}
