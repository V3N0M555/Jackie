package handling_listbox;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingSingleSelect {
public static void main(String[] args) throws InterruptedException {
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
driver.get("https://www.facebook.com/");
driver.findElement(By.linkText("Create new account")).click();
WebElement day = driver.findElement(By.id("day"));
Select s=new Select(day);
Thread.sleep(2000);
//selectByIndex() will take int index has parameter, index starts from 0
s.selectByIndex(4);
s.deselectByIndex(4);
Thread.sleep(2000);
//selectByValue() will take String value has parameter, value should be taken from value attribute 
s.selectByValue("31");
Thread.sleep(2000);
//selectByVisibleText() will take String value has parameter,we need to pass tagtext of the element
s.selectByVisibleText("7");

}
}
