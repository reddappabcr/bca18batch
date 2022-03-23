package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoSelect {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///D:/html%20files/fwdhtmlpagestopractice/sample.html");
		WebElement city=driver.findElement(By.id("city"));
		Select dd=new Select(city);
		dd.selectByIndex(2);
		Thread.sleep(1500);
		dd.selectByValue("4");
		Thread.sleep(1500);
		dd.selectByVisibleText("Chennai");
	}

}
