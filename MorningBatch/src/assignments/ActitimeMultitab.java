package assignments;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ActitimeMultitab {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://online.actitime.com/qsp4/login.do");
		driver.findElement(By.id("username")).sendKeys("sam.the.undertaker@gmail.com");
		driver.findElement(By.name("pwd")).sendKeys("sam123"+Keys.ENTER);
		driver.findElement(By.xpath("(//div[@class='popup_menu_icon'])[4]")).click();
		driver.findElement(By.linkText("About your actiTIME")).click();
		Thread.sleep(5000);
		driver.findElement(By.linkText("Read Service Agreement")).click();
		
		Set<String> allHand = driver.getWindowHandles();
		Iterator<String> it = allHand.iterator();
		while(it.hasNext()){
			String wid = it.next();
			driver.switchTo().window(wid);
		}
		
		List<WebElement> allH2 = driver.findElements
				(By.xpath("//div[@class='entry-content']/h2[not(contains(text(),'Application Service Agreement'))]"));
		System.out.println(allH2.size());
		for(int i=0;i<allH2.size();i++) {
			System.out.println(allH2.get(i).getText());
		}
		driver.quit();
	}

}
