package assignments;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PIBMulti {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://pib.gov.in/indexd.aspx");
		List<WebElement> allLinks = driver.findElements(By.xpath("//div[@class='col-md-4 col-xs-12 firstulfooter']/ul/li/a"));

		for (WebElement x : allLinks) {
			x.click();
			driver.switchTo().alert().accept();
			Thread.sleep(2000);
		}
		
		Set<String> allHand = driver.getWindowHandles();
		Iterator<String> it = allHand.iterator();
		while(it.hasNext()) {
			String wid = it.next();
			driver.switchTo().window(wid);
			String title = driver.getTitle();
			System.out.println(title);
			if(!title.contains("Ministry of Information and Broadcasting"))
			driver.close();
			Thread.sleep(1000);
		}

	}

}
