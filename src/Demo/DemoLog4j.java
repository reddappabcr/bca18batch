package Demo;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoLog4j {
	public static Logger log=Logger.getLogger("customer pagee");
	
	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		log.info("open browser");
		driver.get("https://demo.actitime.com/login.do");
		log.info("open actitime page");
		driver.findElement(By.id("username")).sendKeys("admin");
		log.info("admin enterd");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		log.info("manager enterd");
		driver.findElement(By.id("loginButton")).click();
		log.info("login pressed");		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		log.info("logout pressed");
		
		
	}
}
