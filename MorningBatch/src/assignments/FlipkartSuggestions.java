package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartSuggestions {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.name("q")).sendKeys("Iphone 15 pro max");
		Thread.sleep(2000);
		List<WebElement> allSuggs = 
		driver.findElements(By.xpath("//*[contains(text(),'iphone 15 pro max')]"));
		System.out.println(allSuggs.size());
		for (WebElement ele : allSuggs) {
			String text = ele.getText();
			System.out.println(text);
		}
	}
}
