/*Example to show how to press and hold a keyboard button*/


package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.latest.performance.Performance;
import org.openqa.selenium.interactions.Actions;

public class Actions_ClickandHold {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.kirupa.com/html5/press_and_hold.htm");
		driver.manage().window().maximize();
		
		WebElement clickitem = driver.findElement(By.id("item"));
		 
		 Actions ac = new Actions(driver);
		 ac.clickAndHold(clickitem).perform();
	
	
	}

}