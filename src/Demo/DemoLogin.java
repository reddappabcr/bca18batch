package Demo;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoLogin {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		System.out.println("open browser");
		driver.get("https://demo.actitime.com/login.do");
		System.out.println("open actitime page");
		driver.findElement(By.id("username")).sendKeys("admin");
		System.out.println("admin enterd");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		System.out.println("manager enterd");
		driver.findElement(By.id("loginButton")).click();
		System.out.println("login pressed");		
		Thread.sleep(1500);
		driver.findElement(By.xpath("//a[text()='Logout']")).click();
		System.out.println("logout pressed");
		
		
	}
	

}
