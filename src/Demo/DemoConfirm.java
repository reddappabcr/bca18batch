package Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoConfirm {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("file:///D:/BCA/HTML%20FILES/confirmTest.html");
		driver.findElement(By.id("btn1")).click();
		Alert alert=driver.switchTo().alert();
		alert.dismiss();
		String str=alert.getText();
		System.out.println(str);
		alert.accept();

	}

}
