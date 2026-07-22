/*Sign up on a Demo app
change username and password*/

package basicSelenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Locators_Example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/");
		driver.manage().window().maximize();
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.elementToBeClickable(By.id("signin2"))).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("sign-username"))).sendKeys("randomademail@gmail.com");
		driver.findElement(By.id("sign-password")).sendKeys("vjvbksgfvb");
		
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"signInModal\"]/div/div/div[3]/button[2]"))).click();
		
		//Handle JavaScript alert
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		System.out.println("Alert message: " + alert.getText());
		alert.accept(); //clicks OK
	}

}
