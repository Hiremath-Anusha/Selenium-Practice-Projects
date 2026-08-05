package basicSelenium;

import java.lang.module.FindException;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Xpath_Text {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	WebDriver driver = new ChromeDriver();
	driver.get("https://www.demoblaze.com/");
	driver.manage().window().maximize();
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	
	
	driver.findElement(By.xpath("//a[text()='Log in']")).click();
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@id='loginusername']"))).sendKeys("fullmoon");
	driver.findElement(By.xpath("//input[@id='loginpassword']")).sendKeys("random");
	
	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[text()='Log in']"))).click();
	
	Alert alert = wait.until(ExpectedConditions.alertIsPresent());
	System.out.println(alert.getText());
	alert.accept();
	}

}
