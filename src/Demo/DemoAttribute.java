package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoAttribute {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new FirefoxDriver();		
		driver.get("https://demo.actitime.com/login.do");
		Thread.sleep(1500);
		String str=driver.findElement(By.id("username")).getAttribute("class");
		System.out.println(str);
	}

}
