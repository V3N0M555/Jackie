package assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoappsCheckBox {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		driver.findElement(By.xpath("//button[text()='Quick Start']")).click();
		driver.findElement(By.xpath("//a[@href='/ui/checkbox']")).click();
		
		List<WebElement> allCheck = driver.findElements(By.xpath("//input[@type='checkbox']"));
		
		System.out.println(allCheck.size());
//		for (WebElement x : allCheck) {
//			System.out.println(x);
//		}
		
		
		int count=0;
		for (WebElement x : allCheck) {
			x.click();	
			Thread.sleep(1000);
		}
		
		for (WebElement x : allCheck) {
			boolean res = x.isSelected();
			if(res)
				count++;
		}
		if(count==10)
			System.out.println("all 10 are selected");
		
		System.out.println(count);

	}

}
