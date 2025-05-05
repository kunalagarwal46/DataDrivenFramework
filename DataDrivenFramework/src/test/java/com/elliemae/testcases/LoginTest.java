package com.elliemae.testcases;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.elliemae.base.TestBase;

public class LoginTest extends TestBase{
	
	@Test
	public void method1() throws InterruptedException {
		
		String x = or.getProperty("bmlBtn");
		System.out.println(x);
		
		driver.findElement(By.cssSelector(or.getProperty("bmlBtn"))).click();
		Thread.sleep(10);
	}
	
	

}
