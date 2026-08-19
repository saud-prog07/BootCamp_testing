package com.coforge.waits;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImplicitWaitDemo {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.easemytrip.com/flights.html?utm_campaign=788997081&utm_source=g_c&utm_medium=cpc&utm_term=e_easemytrip&adgroupid=39319940377&gad_source=1&gad_campaignid=788997081&gbraid=0AAAAADo_0-hKhRcoJZAtRX43buAtcLNxf&gclid=Cj0KCQjw4orUBhCjARIsAIbF3qwwlcJ6u3mdCinNgKu7x4fr8ROMxtD3JU2VhBdSkzL9sIYt4YN1o7YaAiX3EALw_wcB");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	    // if element is visible it wont wait for 20 sec directly runs the next line
	    // applicable to every element down
		
		driver.findElement(By.id("FromSector_show")).sendKeys("Delhi" , Keys.ENTER); // Keys.emter is action command
		driver.findElement(By.id("Editbox13_show")).sendKeys("Mumbai" , Keys.ENTER);
		driver.findElement(By.id("ddate")).click();
		driver.findElement(By.id("six_0_30/08/2026")).click();
		driver.findElement(By.className("srchBtnSe")).click();
	}


}
