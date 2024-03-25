package methods_of_webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class VerifyAllignment {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	driver.findElement(By.linkText("Create new account")).click();
	Thread.sleep(2000);
	int y1 = driver.findElement(By.xpath("//label[text()='Female']/../input")).getLocation().getY();
	int y2 = driver.findElement(By.xpath("//label[text()='Male']/../input")).getLocation().getY();
	int y3 = driver.findElement(By.xpath("//label[text()='Custom']/../input")).getLocation().getY();
if(y1==y2&&y2==y3) {
	System.out.println("All the 3 radio button are alligned properly");
}else {
	System.out.println("All the 3 radio button are not alligned properly");
}
}
}
