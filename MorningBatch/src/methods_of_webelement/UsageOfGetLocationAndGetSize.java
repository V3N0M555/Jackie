package methods_of_webelement;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class UsageOfGetLocationAndGetSize {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://www.facebook.com/");
	WebElement ele = driver.findElement(By.name("login"));
//getLocation() is used to get the location of the particular element in form of xAxis and yAxis
	Point p = ele.getLocation();
	int xAxis = p.getX();
	int yAxis = p.getY();
	System.out.println("The x Axis value of login button is: "+xAxis);
	System.out.println("The y Axis value of login button is: "+yAxis);
//getSize() is used to get the size of the particular element in the form of height and width
	Dimension d = ele.getSize();
	int height = d.getHeight();
	int width = d.getWidth();
	System.out.println("The height of login button is: "+height);
	System.out.println("The width of login button is: "+width);
//getRect() is a combination of both getSize() and getLocation()
}
}
