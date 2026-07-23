package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions_DragandDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	WebDriver driver = new ChromeDriver();
	driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
	driver.manage().window().maximize();
	
	WebElement dragitem = driver.findElement(By.id("draggable"));
	WebElement dropitem = driver.findElement(By.id("droptarget"));
	
	Actions ac = new Actions(driver);
	ac.dragAndDrop(dragitem, dropitem).perform();
	
	
	}

}
