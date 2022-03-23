package Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DemoSynchronization {

	public static void main(String[] args)  {
		
		try {

			
			WebDriver driver=new FirefoxDriver();
			driver.manage().window().maximize();
			
			driver.get("https://demo.actitime.com/login.do");		
			driver.findElement(By.id("username")).sendKeys("admin");		
			driver.findElement(By.name("pwd")).sendKeys("manager");		
			driver.findElement(By.id("loginButton")).click();	
			
			Thread.sleep(30000);
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			
			WebDriverWait wait=new WebDriverWait(driver,05);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[text()='Logout']")));
			
			driver.findElement(By.xpath("//a[text()='Logout']")).click();
			
			
			
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
		
		

	}

}
