package com.puma.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

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
	@FindBy(xpath="//div[@class='product-size-click-btn']")
	private WebElement Size;
	@FindBy(xpath="(//span[@class='swatch-label2'])[2]")
	private WebElement sizenum;
	@FindBy(xpath="(//span[.='Add to Cart'])[1]")
	private WebElement addtocart;  
	@FindBy(xpath="//select[@name='cart[992399][qty]']//option[@value='1']")
	private WebElement comSize; 
	
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
	public void comparision()
	{
		String actual = "1";
		String expected=comSize.getText();
		Assert.assertEquals(actual, expected);
		
		
	}
	 
}
