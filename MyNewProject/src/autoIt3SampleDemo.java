
import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;  
import org.openqa.selenium.By;

public class autoIt3SampleDemo extends Reusable {
	

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
		launchbrowser("chrome");
		driver.manage().window().maximize();
		openapp("http://www.schaeferautobody.com/#schedule");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='schedule']/div[2]/a/p")).click();
		Thread.sleep(3000);
		JavascriptExecutor js = (JavascriptExecutor)driver;  
        js.executeScript("scrollBy(0, 600)");  
		//Runtime.getRuntime().exec("D:\\Selenium Data\\UploadFile1.exe");
		driver.findElement(By.name("filename")).click();
		
		Thread.sleep(5000);

	}

}
