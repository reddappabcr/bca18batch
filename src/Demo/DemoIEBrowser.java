package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class DemoIEBrowser {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.ie.driver", "D:\\selenium jar files\\IEDriverServer.exe");
		WebDriver driver=new InternetExplorerDriver();

	}

}
