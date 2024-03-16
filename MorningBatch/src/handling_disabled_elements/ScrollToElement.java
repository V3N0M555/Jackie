package handling_disabled_elements;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollToElement {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.bbc.com/");
		WebElement ele = driver.findElement(By.xpath("//h2[text()='Latest Business News']"));
		int yAxis = ele.getLocation().getY();
		JavascriptExecutor jse=(JavascriptExecutor) driver;
//JSE will scroll until the element is placed on top of the web page
		jse.executeScript("window.scrollTo(0,"+yAxis+")");
		Actions a=new Actions(driver);
//scrollToElement() will scroll until particular element is displayed on the UI
		a.scrollToElement(ele).perform();
	}
}
