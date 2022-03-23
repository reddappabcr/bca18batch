package Demo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;


public class DemoDownload {

	public static void main(String[] args) {
		
		
		FirefoxProfile prof=new FirefoxProfile();
		prof.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/zip");
		prof.setPreference("browser.download.folderList", 2);
		prof.setPreference("browser.download.dir", "D:\\BCA");
		
		
		
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.get("https://www.selenium.dev/downloads/");
		driver.findElement(By.xpath("//a [text()='WebDriver']")).click();
		driver.findElement(By.xpath("//a[@href='https://www.nuget.org/api/v2/package/Selenium.WebDriver/3.141.0']")).click();
		
		
	}

}
