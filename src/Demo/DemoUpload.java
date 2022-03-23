package Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoUpload {

	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("file:///D:/BCA/HTML%20FILES/SELENIUM.HTML");
		driver.findElement(By.name("BROWSE")).sendKeys("file:///D:/BCA/HTML%20FILES/learn.html");
		

	}

}
