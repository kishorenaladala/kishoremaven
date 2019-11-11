
import org.openqa.selenium.By;

public class bingValidationCommands extends Reusable {
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		launchbrowser("firefox");
		openapp("https://www.bing.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='id_sc']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='hbsettings']/div/div[2]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@id='hbsettree']/a[4]/div/div[2]")).click();
		Thread.sleep(3000);
		boolean status =driver.findElement(By.xpath("//*[@id='enAS']")).isSelected();
		Thread.sleep(3000);
		if(status==true){
			System.out.println("Check Box is checked");
			}
		
		else
			{
				
			System.out.println("Check Box is not checked");
			
			}
		
				
		
		driver.close();
		

	}

}
