package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class VtigerMouseActions {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.vtiger.com/");
		WebElement resources = driver.findElement(By.xpath("//a[contains(text(),'Resources')]"));
		Actions a = new Actions(driver);
		a.moveToElement(resources).perform();
		
		driver.findElement(By.xpath("//a[contains(text(),'Customers')]")).click();
		WebElement ele = driver.findElement(By.xpath("//span[text()='Login']"));
		a.doubleClick(ele).perform();
		Thread.sleep(3000);
		String title = driver.getTitle();
		
		if(title.contains("Login"))
			System.out.println("pass");
		else
			System.out.println("fail");
		
	}

}
