
// Example of using Relative Xpath
//Pop up alert handling using Alert


package basicSelenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Xpath_Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@id='signin2']"))).click();
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='sign-username']"))).sendKeys("DummyDragon");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("random123");
		driver.findElement(By.xpath("//button[@onclick='register()']")).click();
		//handling exception: popup text accept
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		System.out.println(alert.getText());
		alert.accept();
		
	}

}
