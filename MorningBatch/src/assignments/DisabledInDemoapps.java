package assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DisabledInDemoapps {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.findElement(By.xpath("//li[text()='Disabled']")).click();
		WebElement ele = driver.findElement(By.tagName("form"));
		Thread.sleep(10000);
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById(\"email\").value='Ram@gmail.com'");
		js.executeScript("document.getElementById(\"name\").value='Ram'");
		js.executeScript("document.getElementById(\"password\").value='Ram123'");
		
				
	}

}
