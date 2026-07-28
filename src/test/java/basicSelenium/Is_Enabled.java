package basicSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Is_Enabled {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.advantageonlineshopping.com/#/");
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.id("menuUser"))).click();
		
		WebElement signin = driver.findElement(By.id("sign_in_btn"));
		boolean before= signin.isEnabled();
		//boolean before = driver.findElement(By.id("sign_in_btn")).isEnabled();
		System.out.println(before);
		
		wait.until(ExpectedConditions.elementToBeClickable(By.name("username"))).sendKeys("dummydragon");
		wait.until(ExpectedConditions.elementToBeClickable(By.name("password"))).sendKeys("nbmg124");
		
		boolean after = signin.isEnabled();
		//boolean after = driver.findElement(By.id("sign_in_btn")).isEnabled();
		System.out.println(after);
		
	}

}
