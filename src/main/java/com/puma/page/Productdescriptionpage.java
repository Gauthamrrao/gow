package com.puma.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import com.puma.generic.Basepage;

public class Productdescriptionpage extends Basepage 
{
	@FindBy(xpath="//span[contains(.,'evoKNIT')]")
	private WebElement actualtitle;

	@FindBy(xpath="//div[@class='product-size-click-btn']")
	private WebElement dropDownbtn;
	
	@FindBy(xpath="//span[@id='180~229']")
	private WebElement sizeList;
	
	@FindBy(xpath="//div[@class='add-to-cart-buttons']")
	private WebElement addtoCartbutton;
	
	
	
	@FindBy(xpath="(//a[contains(.,'Running Shoes')])[2]")
	private WebElement expectedtitle;
	
	public Productdescriptionpage(WebDriver driver) 
	{
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void dropDown()
	{
		//click on SizeDropdown
		dropDownbtn.click();
		//Click on Size
		sizeList.click();
		//Click on Add to cart Button
		addtoCartbutton.click();
	}
	
	public void verifiyContent()
	{
		//Compare Expected titile and Actual title
		String actual = actualtitle.getText();
		String expected =expectedtitle.getText();
		Assert.assertEquals(actual, expected);
		Reporter.log("The title matches",true);
	}
	
	

}
