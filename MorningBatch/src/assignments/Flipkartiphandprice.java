package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkartiphandprice {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(500);
		driver.findElement(By.name("q")).sendKeys("iphone 14 pro max"+Keys.ENTER);
		Thread.sleep(1000);
		List<WebElement> nameList = driver.findElements(By.xpath("//div[contains(text(),'Apple iPhone')]"));
//		
//		for (WebElement x : nameList) {
//			System.out.println(x.getText());
//		}
		
		List<WebElement> listPrice = driver.findElements(By.xpath("//div[contains(text(),'Apple iPhone')]/../../div[2]/div[1]/div/div[1]"));
		
//		for (WebElement x : listPrice) {
//			System.out.println(x.getText());
//		}
		
		for(int i=0;i<listPrice.size();i++) {
			System.out.println(nameList.get(i).getText()+" ==> "+listPrice.get(i).getText());
		}
		if(listPrice.size()==nameList.size()) {
			System.out.println(nameList.size());
		}
		
	}
}
