package assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MyntraHoverAction {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.myntra.com/");
		List<WebElement> allEle = driver.findElements(By.xpath("//div[@class='desktop-navContent']/div"));
		Actions a = new Actions(driver);
		
		
		for (WebElement x : allEle) {
			a.moveToElement(x).perform();
			Thread.sleep(1000);
		}	
		for(int i=allEle.size()-1;i>=0;i--) {
			a.moveToElement(allEle.get(i)).perform();
			Thread.sleep(1000);
		}
		driver.quit();
		
	}

}
