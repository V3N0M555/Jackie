package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BBCNewspg {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bbc.com/");
		Thread.sleep(2000);
		List<WebElement> newsList = driver.findElements(By.xpath("//h2[.='Latest Business News']/../ul/li"));
		System.out.println(newsList.size());
		
		for(WebElement x:newsList) {
			System.out.println(x.getText());
		}
		driver.quit();
		
	}

}
