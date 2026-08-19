package com.coforge.multipleframes;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.coforge.utility.Helper;

public class MultipleFrames {

	@Test
	public void Frames() throws Exception {
		WebDriver driver = Helper.startBrowser("Chrome");
		driver.get("file:///C:/Iframes.html");
		Thread.sleep(10000);
	
		int totalnoofframes = driver.findElements(By.tagName("iframe")).size();
		System.out.println("Number of Frames: " + totalnoofframes);

		driver.switchTo().frame("easycalculation");

		driver.get("https://www.login.hiox.com/login?referrer=easycalculation.com");

		driver.findElement(By.id("log_email")).sendKeys("9100982339");
		driver.findElement(By.id("log_password")).sendKeys("charith");

		driver.findElement(By.xpath("//input[contains(@name,'log_submit')]")).click();

		String title = driver.getTitle();
		System.out.println(title);
	
		driver.navigate().to("file:///C:/IFrames/Iframes.html");
	
		Thread.sleep(5000);
	
		driver.findElement(By.xpath("/html/body/a")).click();
	
		driver.navigate().to("https://www.selenium.dev/");
	
		driver.findElement(By.xpath("//*[@id=\"main_navbar\"]/ul/li[3]/a/span")).click();
	
		Thread.sleep(5000);
	
		String title1 = driver.getTitle();
		System.out.println(title1);
	
		driver.navigate().to("file:///C:/IFrames/Iframes.html");
	
		driver.switchTo().frame("My Store");
	
		driver.navigate().to("https://practicetestautomation.com/practice-test-login/");
	
		driver.findElement(By.id("username")).sendKeys("student"); //username
		driver.findElement(By.id("password")).sendKeys("Password123");
	
		driver.findElement(By.xpath("//button[@id='submit']")).click();
	
		String title2 = driver.getTitle();
		System.out.println(title2);
	
		Thread.sleep(5000);
	
		driver.quit();
	

	}
}
