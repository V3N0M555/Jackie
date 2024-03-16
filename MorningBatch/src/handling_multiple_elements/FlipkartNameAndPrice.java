package handling_multiple_elements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FlipkartNameAndPrice {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.flipkart.com/");
	driver.findElement(By.name("q")).sendKeys("Iphone 14 pro max"+Keys.ENTER);
	Thread.sleep(2000);
	List<WebElement> allMobiles = 
		driver.findElements(By.xpath("//div[contains(text(),'Apple iPhone ')]"));
	List<WebElement> allPrices = driver.findElements(By.xpath
		("//div[contains(text(),'Apple iPhone ')]/../../div[2]/div[1]/div/div[1]"));
	for(int i=0;i<allMobiles.size()&&i<allPrices.size();i++) {
		WebElement ele = allMobiles.get(i);
		WebElement ele1 = allPrices.get(i);
		String name = ele.getText();
		String price = ele1.getText();
		System.out.println(name+" ==> "+price);
	}
	driver.quit();
	
}
}
