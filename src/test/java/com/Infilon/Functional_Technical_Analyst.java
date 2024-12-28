package com.Infilon;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Functional_Technical_Analyst {
	
	WebDriver driver;
	@Test
	public void job_post() {
		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Navigating to the job post

		driver.get("https://www.tutorialspoint.com/selenium/practice/selenium_automation_practice.php");
		
		driver.findElement(By.xpath("//*[@id=\"headingOne\"]")).click();
		
		driver.findElement(By.xpath("//*[@id=\"navMenus\"]/li[8]/a")).click();
		
		Path path=Paths.get("src/test/resources/Shashikant_Kokitakar.pdf");
		
		String filepath=path.toAbsolutePath().toString();
		
		driver.findElement(By.xpath("//input[@id='uploadFile']")).sendKeys(filepath);
	}
	
	@AfterMethod()
	public void tear_down()
	{
		driver.quit();
	}

}
