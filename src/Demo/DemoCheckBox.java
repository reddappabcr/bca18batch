package Demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DemoCheckBox {

	public static void main(String[] args) 
	{
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///D:/html%20files/fwdhtmlpagestopractice/sample.html");
		Boolean chkBox=driver.findElement(By.name("rep")).isSelected();
		System.out.println(chkBox);
		driver.findElement(By.name("rep")).click();
		Boolean chkBox1=driver.findElement(By.name("rep")).isSelected();
		System.out.println(chkBox1);
		driver.findElement(By.name("rep")).click();
		Boolean chkBox2=driver.findElement(By.name("rep")).isSelected();
		System.out.println(chkBox2);
	}

}
