package com.puma.generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class Basepage 
{
	public static WebDriver driver;
	public  Actions act;
	public Basepage(WebDriver driver)
	
	{
		PageFactory.initElements(driver, this);
		this.driver=driver;
		
	}
	public boolean verifiyTitle(String etitle)
	{
		boolean verified=false;
		WebDriverWait wait= new WebDriverWait(driver, 7);
		try{
			wait.until(ExpectedConditions.titleIs(etitle));
			Reporter.log("pass:The title is matching",true);
			verified=true;
			
			
		}
		catch(Exception e){
			Reporter.log("fail:Title is not matching",true);
			
			verified=false;
			
		}
		return verified;
	}

}
