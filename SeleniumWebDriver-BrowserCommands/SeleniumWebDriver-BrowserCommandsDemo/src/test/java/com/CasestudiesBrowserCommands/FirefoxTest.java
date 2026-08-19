package com.coforge.CasestudiesBrowserCommands;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class FirefoxTest {

	@Test(priority=0)
	public void Demoblaze() {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.quit();
	}
	
	@Test(priority=1)
	public void Testautomationpractice() {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	}
	
	@Test(priority=2)
	public void Testfire() {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("http://testfire.net/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	}
	
	
	@Test(priority=3)
	public void Amazon() {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	}
	
	

	@Test(priority=4)
	public void Flipkart() {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	}
	
	@Test(priority=5)
	public void Myntra() {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	}
	
	@Test(priority=6)
	public void Ajio() {
		FirefoxDriver driver = new FirefoxDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	}
}