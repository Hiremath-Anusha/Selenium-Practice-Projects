package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_AndOr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://kirantestingacademy.com/xpath");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@type='radio' and @value='female']")).click();
		driver.findElement(By.xpath("//input[@type='radio' or @value='female']")).click();
	}

}
