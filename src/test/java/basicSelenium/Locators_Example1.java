/*Open Amazon.de
Search an item and click search button using locators*/

package basicSelenium;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Locators_Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.de");
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"sp-cc-rejectall-link\"]"))).click();
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("portable fan");
		//driver.findElement(By.id("nav-search-submit-button")).click();
		
		
		//To press ENTER from keyboard
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("portable fan" + Keys.ENTER); 
		
		
	}

}
