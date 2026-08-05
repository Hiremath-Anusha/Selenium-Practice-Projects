package basicSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Xpath_Contains {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@aria-label = 'Decline optional cookies']"))).click();
		driver.findElement(By.linkText("Create new account")).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@aria-label = 'Decline optional cookies']"))).click();
		driver.findElement(By.xpath("//input[contains(@id, '_r_t_')]")).sendKeys("Dummydragon");
		//                           //tag[contains(@att,'substring')] 
	}

}

