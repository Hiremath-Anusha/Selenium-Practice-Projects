package basicSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Is_Displayed {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.easemytrip.com/");
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		//click on oneway and check if multicity is displayed
		boolean oneway = driver.findElement(By.id("mulfrmcity2")).isDisplayed();
		System.out.println(oneway);//should display false
		
		//click on Multicity and check if multicity is displayed
		driver.findElement(By.id("mcity")).click();
		boolean multicity = driver.findElement(By.id("mulfrmcity2")).isDisplayed();
		System.out.println(multicity);//should display as true
		driver.quit();
	}

}
