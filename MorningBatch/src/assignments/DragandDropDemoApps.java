package assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDropDemoApps {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demoapps.qspiders.com/ui/dragDrop/dragToCorrect?sublist=1");
		List<WebElement> ele = driver.findElements(By.xpath("//div[@class='draggable']"));
		WebElement mob = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
		WebElement lap = driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
		Actions a = new Actions(driver);
		
		
		for (WebElement x : ele) {
			if(x.getText().contains("Mobile")) {
				a.dragAndDrop(x, mob).perform();
			}
			else
				a.dragAndDrop(x, lap).perform();
			Thread.sleep(1000);
			
		}

	}

}
