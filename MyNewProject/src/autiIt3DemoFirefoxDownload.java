
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class autiIt3DemoFirefoxDownload extends Reusable {
	

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		launchbrowser("firefox");
		openapp("https://www.mozilla.org/en-US/firefox/new/");
		driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
		driver.findElement(By.xpath("//*[@id='download-button-desktop-release']/ul/li[3]/a/strong")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("/html/body/div[3]/div/div/aside/div/ul/li[3]/a/strong")).click();
		Thread.sleep(4000);
		Runtime.getRuntime().exec("D:\\Selenium Data\\UploadFile2.exe");
		driver.close();
		
		
	}

}
