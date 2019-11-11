

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AutoCompleteDemo extends Reusable {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		launchbrowser("firefox");
		//driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		openapp("https://jqueryui.com/autocomplete/");
		Thread.sleep(3000);
		driver.switchTo().frame(0);
		driver.findElement(By.id("tags")).sendKeys("S");
		WebElement tags =driver.findElement(By.id("ui-id-1"));
		List<WebElement> tags_list = tags.findElements(By.tagName("li"));
		System.out.println(tags_list.size());
		Thread.sleep(3000);
		for (int i=0;i<tags_list.size();i++)
		{
			String values = tags_list.get(i).getText();
			System.out.println(values);
			if (values.equalsIgnoreCase("BASIC"))
			{
				tags_list.get(i).click();
				break;
			}
			
		}
		driver.close();
		
	}


}

