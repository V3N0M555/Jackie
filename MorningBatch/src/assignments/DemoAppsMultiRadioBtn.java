package assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoAppsMultiRadioBtn {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
//		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[text()='Quick Start']")).click();
//		Thread.sleep(1500);
		driver.findElement(By.xpath("//a[@href='/ui/radio']")).click();
		Thread.sleep(6000);
		List<WebElement> allCheck = driver.findElements(By.xpath("//input[@value]"));
		System.out.println(allCheck.size());
		for (WebElement x : allCheck) {
			System.out.println(x);
		}
		
		allCheck.get(0).click();
//		System.out.println(allCheck.get(1).isSelected());
		int count=0;
		for (WebElement x : allCheck) {
			x.click();			
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
