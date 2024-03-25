package assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FramesInDemoautomationTestingSite {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://demo.automationtesting.in/Frames.html");
		
		driver.findElement(By.linkText("Iframe with in an Iframe")).click();
		
		List<WebElement> frms = driver.findElements(By.xpath("//iframe"));
		System.out.println(frms.size());
		WebElement ele1 = driver.findElement(By.xpath("(//iframe[@src='MultipleFrames.html'])"));
		driver.switchTo().frame(ele1);
//		driver.switchTo().frame(0);
//		Thread.sleep(2000);
//		driver.findElement(By.tagName("input")).sendKeys("GG");
		
		//after entering into a frame the search will be rediced to that frame itself even though 
		//the x path can find multiple elements
		WebElement ele2 = driver.findElement(By.xpath("(//iframe[@src='SingleFrame.html'])"));
		driver.switchTo().frame(ele2);
		driver.findElement(By.tagName("input")).sendKeys("GG");
		

	}

}
