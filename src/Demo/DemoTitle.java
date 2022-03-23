package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoTitle {

	public static void main(String[] args) {
	
	WebDriver driver= new FirefoxDriver();
	driver.get("https://demo.actitime.com/login.do");
	String expectedTitle="actiTIME - Login1";
	String actualTitle=driver.getTitle();
	
	if(actualTitle.equals(expectedTitle))
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}
	
	
	driver.close();
	

	}

}
