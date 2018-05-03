package com.puma.generic;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Commonactions {
	public static WebDriver driver;
	public static void SelectByIndex(WebElement wb, int n)
	{
	  Select sel =new Select(wb);
	  sel.selectByIndex(n);
	}
	public static void SelectByValue(WebElement wb,String name)
	{
		Select sel=new Select(wb);
		sel.selectByValue(name);
	}
	public static void SelectByVisibletext(WebElement wb, String n)
	{
		Select sel=new Select(wb);
		sel.selectByVisibleText(n);
	}
	public static void movetoElelemt(WebDriver driver,WebElement src,WebElement des)
	{
		Actions act=new Actions(driver);
		act.dragAndDrop(src, des);
	}
	public static void WindowHandel(WebDriver driver,String etitle)
	{
		Set<String> st=driver.getWindowHandles();
		for(String wh:st)
		{
			driver.switchTo().window(wh);
			if (driver.getTitle().equals(etitle)) {
				break;
			}

		}
	}

}
