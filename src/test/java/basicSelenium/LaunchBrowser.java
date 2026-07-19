/*Launch chrome browser and open facebook
*/
package basicSelenium;


import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LaunchBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		//driver.findElement(By.xpath("//*[@id=\"facebook\"]/body/div[4]/div[1]/div/div[2]/div/div/div/div/div[2]/div/div[1]/div[2]/div")).click();//decline cookies
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"facebook\"]/body/div[4]/div[1]/div/div[2]/div/div/div/div/div[2]/div/div[1]/div[2]/div"))).click();
	
	
	
	
	
	
	}

}
