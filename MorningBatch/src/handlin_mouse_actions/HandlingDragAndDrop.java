package handlin_mouse_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingDragAndDrop {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	driver.get("https://t.ly/R7ReI");
	Actions a=new Actions(driver);
	WebElement draggable = driver.findElement(By.xpath("//h1[text()='Block 1']"));
	WebElement droppable = driver.findElement(By.id("column-3"));
	a.dragAndDrop(draggable, droppable).perform();
//Whenever we perform compound actions we can use build() which will return Action interface.
//In Action interface we have perform()
	a.clickAndHold(draggable).moveToElement(droppable).pause(2000).release().build().perform();
//Method chaining
}
}
