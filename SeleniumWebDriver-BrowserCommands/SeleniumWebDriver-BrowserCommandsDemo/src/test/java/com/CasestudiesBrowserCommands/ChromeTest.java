package com.coforge.CasestudiesBrowserCommands;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ChromeTest {
	
	@Test(priority=0)
	public void Demoblaze() {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		
		driver.quit();
	}
	
	@Test(priority=1)
	public void Testautomationpractice() {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	}
	
	@Test(priority=2)
	public void Testfire() {
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://testfire.net/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	}
	
	
	@Test(priority=3)
	public void Amazon() {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	}
	
	

	@Test(priority=4)
	public void Flipkart() {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	}
	
	@Test(priority=5)
	public void Myntra() {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	}
	
	@Test(priority=6)
	public void Ajio() {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
	}

}