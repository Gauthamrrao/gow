package com.puma.generic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class Basetest implements Iautoconst {
	public static WebDriver driver;
	@BeforeSuite
	public void initApp()
	{
	System.setProperty(CHROME_KEY, CHROME_VALUE);
	System.setProperty(GECKO_KEY, GECKO_VALUE);
	}
	@BeforeMethod
	public void openApp()
	{
		System.setProperty(CHROME_KEY, CHROME_VALUE);
		driver = new ChromeDriver();
		driver.get("https://in.puma.com/");
		driver.manage().timeouts().implicitlyWait(7, TimeUnit.SECONDS);
	}
	@AfterMethod
	public void closeApp()
	{
		driver.close();
	}

}
