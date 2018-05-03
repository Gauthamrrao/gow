package com.puma.page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.puma.generic.Basepage;

public class Loginpage extends Basepage 
//Decleration
{
	@FindBy(xpath="//a[contains(.,' MEN ')]")
	private WebElement menoption;
	@FindBy(xpath="//li [@id='men-subnav']//a[text()='Shoes']/../../following-sibling::li/a[text()='Running']")
	private WebElement runningoption;
	@FindBy(id="//ul [@class='products-grid products-grid--max-4-col first last odd']/li[2]/a[@class='product-image promainimg']")
	private WebElement shoesoption2;
	
	//Intialization
	public Loginpage(WebDriver driver) 
	{
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//Utilization
	public void mousehover() throws InterruptedException
	{
		//Mousehover on the option MEN
		act=new Actions(driver);
		act.moveToElement(menoption).build().perform();
		//Click on Running
		runningoption.click();
		Thread.sleep(5000);
		//Click on 2nd option
		shoesoption2.click();
		Thread.sleep(5000);
		
	}
	
	 
}
