/*Id 
 * Name 
 * Linktext
 * Partial Linktext : select link (anchor tag)
 * Tag Name
 * Class Name
 * Css
 * Xpath*/



package basicSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.ElementClickInterceptedException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Locator_Name {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		//Decline cookies
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"facebook\"]/body/div[4]/div[1]/div/div[2]/div/div/div/div/div[2]/div/div[1]/div[2]/div"))).click();
		
		//select the input field email and password and pass the credentials
		driver.findElement(By.name("email")).sendKeys("dummymail@gmail.com");
		driver.findElement(By.name("pass")).sendKeys("somepass");

		}

}
