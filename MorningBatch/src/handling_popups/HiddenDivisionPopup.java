package handling_popups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HiddenDivisionPopup {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://demoapps.qspiders.com/ui/hidden?sublist=0");
	driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Tarun");
	driver.findElement(By.xpath("//input[@type='email']")).sendKeys("Tarun@gmail.com");
	WebElement ele = driver.findElement(By.xpath("//select[@required]"));
	Select s=new Select(ele);
	s.selectByIndex(1);
	driver.findElement(By.id("hiddendiv")).click();
}
}//https://www.careinsurance.com/rhicl/proposalcp/renew/index-care
