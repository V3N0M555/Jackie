package assignments;



import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v85.dom.model.Rect;

public class Facebook14Meth {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		Thread.sleep(1000);
		driver.findElement(By.id("email")).sendKeys("ram@gmail.com");Thread.sleep(1000);
		driver.findElement(By.id("email")).clear();Thread.sleep(1000);
		Thread.sleep(1000);
		WebElement ele = driver.findElement(By.name("login"));
		boolean en = ele.isEnabled();
		if(en) {
			System.out.println("its enabled");
		}
		else {
			System.out.println("its disabled");
		}

		String color = ele.getCssValue("color");
		System.out.println(color);
		String text = ele.getText();
		System.out.println(text);

		
		
		
		driver.findElement(By.linkText("Create new account")).click();Thread.sleep(3000);
		Rectangle namesize = driver.findElement(By.xpath("//div[@class ='large_form']/div/div/div/div")).getRect();
		Thread.sleep(1000);
		Rectangle surname = driver.findElement(By.xpath("//div[@class ='large_form']/div/div/div[2]/div")).getRect();
		Thread.sleep(1000);
		if (namesize.getHeight()==surname.getHeight()&& namesize.getWidth()==surname.getWidth()) {
			System.out.println("both are same size");


		}else
			System.out.println("both are not same size");

		if(namesize.getY()==surname.getY()) {
			System.out.println("both are aligned");
		}
		else
			System.out.println("both are misaligned");

		
		
		

		WebElement radEle = driver.findElement(By.xpath("//label[.='Male']/../input"));
		radEle.click();
		boolean radRes = radEle.isSelected();
		if(radRes)
			System.out.println("radio is selected");
		else
			System.out.println("radio is not selected");
		Thread.sleep(1000); 
		
		driver.findElement(By.name("websubmit")).submit();
		Thread.sleep(3000);
		

		driver.quit();



	}

}
