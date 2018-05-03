package com.puma.test;

import org.testng.annotations.Test;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import com.puma.generic.Basetest;
import com.puma.page.Loginpage;


public class Logintest extends Basetest
{
	@Test
	public void verifiyProduct() throws InterruptedException
	{
		Loginpage l1=new Loginpage(driver);
		l1.mousehover();
		l1.comparision();
		
	}

}
