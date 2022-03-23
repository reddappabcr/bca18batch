package Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginLogOut {

	public static void main(String[] args) throws InterruptedException 
	{
		ExcelLibrary1 xlib=new ExcelLibrary1();
		
		
		int lastrow=xlib.getLastRowNumber("Sheet1");
		
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);		
		driver.get("https://demo.actitime.com/");
		
		for(int i=1;i<lastrow;i++)
		{
			String un=xlib.GetExcelData("Sheet1", i, 0);			
			String pw=xlib.GetExcelData("Sheet1", i, 1);
			
			
			driver.findElement(By.id("username")).sendKeys(un);
			driver.findElement(By.name("pwd")).sendKeys(pw);
			driver.findElement(By.id("loginButton")).click();
			Thread.sleep(10000);
			driver.findElement(By.xpath("//a[text()='Logout']")).click();
			Thread.sleep(5000);
		}
		
		
		
	}

}
