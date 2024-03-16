package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollInFlipkart {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://www.google.com");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		for (;;) {
			try {
				// Element is present in the bottom we need to scroll until element is visible
				driver.findElement(By.id("")).click();
				break;
			} catch (NoSuchElementException e) {
				//It will scroll until the element is displayed on the UI
				jse.executeScript("window.scrollBy(0,500)");
			}
		}
	}
}
