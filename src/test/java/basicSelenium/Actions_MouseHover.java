package basicSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actions_MouseHover {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.de");
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("sp-cc-rejectall-link"))).click();
		
		//Storing webelement into a variable
		WebElement account=driver.findElement(By.id("nav-link-accountList"));
		
		//Action class::::::: Always add .perform()
		Actions ac = new Actions(driver);
		ac.moveToElement(account).perform();
	
		//ac.contextClick().sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).perform();
		//iver.quit();
	
		
		
	}

}
