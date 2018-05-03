package com.puma.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class Basetest implements Iautoconst {
	public static WebDriver driver;
	@BeforeSuite
	public void initApp()
	{
		//Setting the path for the Browser
	System.setProperty(CHROME_KEY, CHROME_VALUE);
	}
	@BeforeMethod
	public void openApp()
	{
		//Launch the Browser
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		driver = new ChromeDriver();
		//Enter the URL
		driver.get("https://in.puma.com/");
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
	}
	@AfterMethod
	public void closeApp()
	{
		//close the Browser
		driver.quit();
	}

}
