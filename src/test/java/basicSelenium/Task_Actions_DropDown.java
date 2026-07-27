package basicSelenium;

import java.nio.channels.Selector;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Task_Actions_DropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.linkText("Dropdown")).click();
		WebElement dropdown = driver.findElement(By.id("dropdown"));
		Select sc = new Select(dropdown);
		sc.selectByIndex(2);
		
	
		 
		
		
	}

}
