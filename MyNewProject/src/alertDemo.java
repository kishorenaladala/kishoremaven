
package seleniumProject1;
import org.openqa.selenium.By;

public class alertDemo extends Reusable{

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		launchbrowser("firefox");
		openapp("http://only-testing-blog.blogspot.com/");
		Thread.sleep(3000);
		//driver.switchTo().frame(0);
	
		//Thread.sleep(3000);
		chooseWebElement(3,"TextBox").click();
		Thread.sleep(6000);
		//driver.switchTo().alert().accept();
		chooseWebElement(5,"//*[@id='post-body-4292417847084983089']/div[1]/button[1]").click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		Thread.sleep(3000);
		close_Browser();
		
	}

}
