package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoUrl {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/#spf=1618459840145");
		String expectedUrl="https://www.google.com/#spf=1618459840145";
		String actualUrl=driver.getCurrentUrl();
	 System.out.println(actualUrl);
		  if(actualUrl.equals(expectedUrl))
		    {
		    	System.out.println("pass");
		    }
		    else
		    {
		    	System.out.println("fail");
		    }

	}

}
