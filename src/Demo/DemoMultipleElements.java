package Demo;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoMultipleElements {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		List<WebElement> allLinks=driver.findElements(By.xpath("//a"));
		int s=allLinks.size();
		System.out.println(s);
		
		for(int i=0;i<s;i++)
		{
			WebElement link=allLinks.get(i);
			String str=link.getText();
			System.out.println(str);
		}
		
		
		
		
		
		
	}

}
