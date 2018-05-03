package com.puma.test;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.puma.generic.Basetest;
import com.puma.page.Loginpage;
import com.puma.page.Productdescriptionpage;

public class Productdescriptiontest extends Basetest 
{

	@Test
	public void dropdown() throws InterruptedException
	{
		Loginpage l1=new Loginpage(driver);
		l1.mousehover(); 
		Productdescriptionpage pd1=new Productdescriptionpage(driver);
		pd1.dropDown();
		pd1.verifiyContent();
	}

}
