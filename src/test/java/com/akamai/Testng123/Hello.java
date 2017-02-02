package com.akamai.Testng123;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Hello {
	
	
	@Test
	public void test1()
	{
		System.out.println("This is 1st Program");
	}

	
	@Test
	public void test2()
	{
		System.out.println("This is 2st Program");
	}

	
	@Test
	public void Launchssss()
	{
		System.setProperty("webdriver.chrome.driver", "//Users//deekumar//Downloads//chromedriver");
		WebDriver driver= new ChromeDriver();
	
		driver.get("https://gmail.com");
		
		
	}
}
