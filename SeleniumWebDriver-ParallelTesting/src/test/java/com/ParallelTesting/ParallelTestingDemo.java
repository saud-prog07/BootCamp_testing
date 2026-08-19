package com.coforge.paralleltesting;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParallelTestingDemo {
	WebDriver driver;
	String baseUrl = "https://practicetestautomation.com/practice-test-login/";
	
	@Parameters("browserName")
	@BeforeTest
	public void setUp(String browserName) {
		System.out.println("Browser Name : " + browserName);
		if(browserName.equalsIgnoreCase("chrome")) {
			driver = new ChromeDriver();
		}
		else if(browserName.equalsIgnoreCase("Firefox")) {
			driver = new FirefoxDriver();
		}
		else if(browserName.equalsIgnoreCase("Edge")) {
			driver = new EdgeDriver();
		}
	}
	
	@Test
	public void BrowserTest() throws Exception {
		driver.get(baseUrl);
		driver.manage().window().maximize();
		Thread.sleep(5000);
		driver.findElement(By. id("username")).sendKeys("student");
		driver.findElement(By.name("password")).sendKeys("Password123");
//		driver.findElement(By.xpath("/html/body/div/div/section/section/div[1]/button")).click();
		driver.findElement(By.xpath("//button[@id='submit']")).click();
	}
	
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}