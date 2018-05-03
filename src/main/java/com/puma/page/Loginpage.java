package com.puma.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import com.puma.generic.Basepage;

public class Loginpage extends Basepage 
//Decleration
{
	@FindBy(xpath="//a[contains(.,' MEN ')]")
	private WebElement menoption;
	@FindBy(xpath="(//a[.='Shoes' and contains(@href,'men')] /../../following-sibling::li/a[.='Running'])[1]")
	private WebElement runningoption;
	@FindBy(id="product-collection-image-71792")
	private WebElement shoesoption2;
	@FindBy(xpath="//span[@class='caret']")
	private WebElement Size;
	@FindBy(xpath="//span[@id='180~229']")
	private WebElement sizenum;
	@FindBy(xpath="//button[@title='Add to Cart']")
	private WebElement addtocart;
	
	//Intialization
	public Loginpage(WebDriver driver) 
	{
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	//Utilization
	public void mousehover() throws InterruptedException
	{
		act=new Actions(driver);
		act.moveToElement(menoption).build().perform();
		runningoption.click();
		Thread.sleep(5000);
		shoesoption2.click();
		Thread.sleep(5000);
		Size.click();
		sizenum.click();
		addtocart.click();
		
		
	}
	 
}
