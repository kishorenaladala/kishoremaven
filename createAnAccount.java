package com.testing;

import java.util.Random;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.AfterTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;

public class createAnAccount extends preLaunchSetup{
	
	@BeforeClass(groups={"RegresionTesting","SanityTesting"})
	public void clickoncreateaccountlink()
	{
		driver.findElement(By.linkText("Create")).click();
	}
	
	
	@BeforeMethod(groups="RegresionTesting")
	public void beforemethod()
	{
		System.out.println(" I am in before method\n");
		
		
	}
	
	@AfterMethod(groups="RegresionTesting")
	public void aftermethod()
	{
		System.out.println(" I am in after method\n");
		
	}
	
	@Test(priority=1,groups="RegresionTesting")
	public void accountcreationwithoutemailaddress()
	{
	
		driver.findElement(By.name("firstname")).clear();
		driver.findElement(By.name("firstname")).sendKeys("Roger");
		driver.findElement(By.name("lastname")).clear();
		driver.findElement(By.name("lastname")).sendKeys("Case");
		driver.findElement(By.name("Submit")).click();
		Assert.assertEquals("This field is required.", driver.findElement(By.className("errorInline")).getText());
		
	}
	@Test(priority=2,groups="SanityTesting")
	public void acccountcreationwithoutpasswordfield()
	{
		driver.findElement(By.name("emailid")).clear();
		driver.findElement(By.name("emailid")).sendKeys("caseroger@gmail.com");
		driver.findElement(By.name("firstname")).clear();
		driver.findElement(By.name("firstname")).sendKeys("new");
		driver.findElement(By.name("lastname")).clear();
		driver.findElement(By.name("lastname")).sendKeys("test");
		driver.findElement(By.name("Submit")).click();
		Assert.assertEquals("Password field cannot be left blank", driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
	}
	@Test(priority=3,groups={"RegresionTesting","SanityTesting"})
	public void acccountcreationwithoutmatchingpasswordfields()
	{
		driver.findElement(By.name("emailid")).clear();
		driver.findElement(By.name("emailid")).sendKeys("caseroger123@gmail.com");
		driver.findElement(By.name("firstname")).clear();
		driver.findElement(By.name("firstname")).sendKeys("new");
		driver.findElement(By.name("lastname")).clear();
		driver.findElement(By.name("lastname")).sendKeys("test");
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("test123456");
		driver.findElement(By.name("Submit")).click();

		//Assert.assertEquals("Password field cannot be left blank", driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		
	}
	@Test(priority=4,groups={"RegresionTesting","SanityTesting"})
	public void acccountcreation()
	{
		Random ra = new Random();
		int num = ra.nextInt(89000);
		
		driver.findElement(By.name("emailid")).clear();
		driver.findElement(By.name("emailid")).sendKeys("newtest"+num+"@gmail.com");
		driver.findElement(By.name("firstname")).clear();
		driver.findElement(By.name("firstname")).sendKeys("Roger1");
		driver.findElement(By.name("lastname")).clear();
		driver.findElement(By.name("lastname")).sendKeys("Case1");
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("Test@123456");
		driver.findElement(By.name("confirmpassword")).clear();
		driver.findElement(By.name("confirmpassword")).sendKeys("Test@123456");
		Select selec = new Select(driver.findElement(By.name("hintquestion")));
		selec.selectByVisibleText("Place of birth");
		driver.findElement(By.name("hintanswer")).sendKeys("Hyderabad");
		driver.findElement(By.name("Submit")).click();
		
		
		
	}
	
	@AfterClass(groups={"RegresionTesting","SanityTesting"})
	public void clickonlogoutlink()	
	{
		//driver.findElement(By.xpath("//*[@id='header']/div[1]/a/img")).click();
		driver.findElement(By.linkText("Logout")).click();
	}
	

}
