package Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DemoDropdown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.revajourneys.com/");
		
		WebElement intTours=driver.findElement(By.xpath("(//a[@href='/reva_australia.html'])[1]"));
		Actions act=new Actions(driver);
		act.moveToElement(intTours).perform();
		
		
		Thread.sleep(5000);
		act.contextClick(intTours).perform();
		Thread.sleep(5000);
		act.sendKeys("T").perform();
		Thread.sleep(5000);
		act.sendKeys(Keys.DOWN).perform();
		Thread.sleep(5000);
		act.sendKeys(Keys.ENTER).perform();
		
	}

}
