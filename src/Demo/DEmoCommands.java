package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DEmoCommands {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("https://www.google.com/");
		driver.findElement(By.partialLinkText("mail")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[@title='Create an account'   and  @target='_blank'])[2]")).click();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		driver.navigate().refresh();
		driver.close();
		
}
}
