package com.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RegisterForTest extends preLaunchSetup{
	
	@BeforeClass(groups={"RegresionTesting","SanityTesting"},enabled = false)
	public void clickonregisterfortest()
	{
		driver.findElement(By.linkText("Register")).click();
	}
	@Test(priority=1,groups="SanityTesting",enabled = false)
	public void selectwhichdoesnothaveparticularfield()
	{
		
		Select Organization = new Select(driver.findElement(By.name("c0")));
	
		Organization.selectByVisibleText("Place of birth");
		
		
		
	}
	
	@Test(priority=2,groups="RegresionTesting",enabled = false)
	public void organization_having_selectedvalue() throws InterruptedException
	{
		Select Organization = new Select(driver.findElement(By.name("c0")));
		Organization.selectByIndex(3);
		Thread.sleep(3000);
		Select examcategory = new Select(driver.findElement(By.name("c1")));
		examcategory.selectByIndex(1);
		Thread.sleep(3000);
		driver.findElement(By.linkText("FDNY Entrance Exam (7001-E2)")).click();
		driver.findElement(By.name("Submit3")).click();
		driver.findElement(By.name("emailid")).clear();
		driver.findElement(By.name("emailid")).sendKeys("a2@gmail.com");
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("123456789Aa@");
		driver.findElement(By.name("loginbtn")).click();
		
		
		
	}
	
	@AfterClass(groups={"RegresionTesting","SanityTesting"},enabled = false)
	public void clickonlogoutlink()	
	{
		//driver.findElement(By.xpath("//*[@id='header']/div[1]/a/img")).click();
		driver.findElement(By.linkText("Logout")).click();
	}
}
