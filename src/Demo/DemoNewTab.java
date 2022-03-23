package Demo;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoNewTab {

	public static void main(String[] args) throws InterruptedException {
	
		
	WebDriver driver=new FirefoxDriver();
	driver.get("https://www.air.irctc.co.in/");
	Thread.sleep(4000);
	driver.findElement(By.xpath("//button[@class='navbar-toggler']")).click();
	driver.findElement(By.xpath("//a[text()='Packages']")).click();
	Thread.sleep(3000);
	
	Set<String> allWindows=driver.getWindowHandles();
	Iterator<String> it=allWindows.iterator();
	String irctc=it.next();
	String tourPackages=it.next();
	System.out.println(irctc);
	System.out.println(tourPackages);
	
	driver.switchTo().window(tourPackages);
	Thread.sleep(5000);
	driver.findElement(By.xpath("(//input[@type='text'])[1]")).sendKeys("Bangalore");
	
	driver.close();
	
	driver.switchTo().window(irctc);
	Thread.sleep(2000);
	
	driver.findElement(By.xpath("(//button[@type='button'])[1]")).click();
	Thread.sleep(2000);
	driver.close();
	}

}
