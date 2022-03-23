package Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoFrames {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("file:///D:/html%20files/frames/frames/frames.html");
		
		//driver.switchTo().frame(1);		
		//driver.findElement(By.name("name1")).sendKeys("reddy");
		
		
		//driver.switchTo().frame("secondframe");
		//driver.findElement(By.name("rep")).click();
		
		
		WebElement frm=driver.findElement(By.xpath("//frame[@src='third.html']"));
		driver.switchTo().frame(frm);
		Thread.sleep(3000);
		driver.findElement(By.name("check")).click();
	
		

	}

}
