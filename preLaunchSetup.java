package com.testing;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;

public class preLaunchSetup {
	//String browsername = "chrome";
	static WebDriver driver;
	
	@Parameters({"browsername","url"})
	@BeforeTest(groups={"RegresionTesting","SanityTesting"})
	public void launchBrowser(String browser, String appurl)
	{
		if(browser.equalsIgnoreCase("firefox")){

			System.setProperty("webdriver.gecko.driver", "D:\\Selenium\\geckodriver-v0.25.0-win64\\geckodriver.exe");
			driver =new FirefoxDriver();

			}else if(browser.equalsIgnoreCase("chrome")){
				

			System.setProperty("webdriver.chrome.driver", "D:\\Selenium\\chromedriver_win32\\chromedriver.exe");
			driver =new ChromeDriver();

			}else if(browser.equalsIgnoreCase("ie")){
				System.out.println("Internet Explorer Browser");

			}
		
		driver.get(appurl);
		driver.manage().window().maximize();
		
		Assert.assertEquals("PSI Online - One stop Solution for Test Takers", driver.getTitle());
		
	
		
	}
	
	@AfterSuite(groups={"RegresionTesting","SanityTesting"})
	public void closeBrowser()
	{
		driver.close();
	}
	
	

}
