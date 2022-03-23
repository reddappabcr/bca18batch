package Demo;



import java.util.List;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DemoMulti {

	

	

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///D:/html%20files/fwdhtmlpagestopractice/sample.html");
		WebElement city=driver.findElement(By.id("cities"));
		Select dd=new Select(city);
		dd.selectByIndex(2);
		Thread.sleep(1500);
		dd.selectByValue("4");
		Thread.sleep(1500);
		dd.selectByVisibleText("Chennai");
		
		
	
		
		//List<WebElement> alloptions=dd.getOptions();
		//int k=alloptions.size();
		//System.out.println(k);
		List<WebElement> alloptions1=dd.getAllSelectedOptions();
		int k1=alloptions1.size();
		System.out.println(k1);
	
		for(int i=0;i<k1;i++)
		{
			WebElement OPTION=alloptions1.get(i);
			String str=OPTION.getText();
			System.out.println(str);
			
		}
		 
		
	}

	
}
