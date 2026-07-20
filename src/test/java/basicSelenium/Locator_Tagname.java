package basicSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Locator_Tagname {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://facebook.com");
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"facebook\"]/body/div[4]/div[1]/div/div[2]/div/div/div/div/div[2]/div/div[1]/div[2]/div"))).click();
		
		int linksize = driver.findElements(By.tagName("a")).size();
		System.out.println("Total number of links in facebook = "+linksize);
		
		//C Locator Class name
		
		int inputsize = driver.findElements(By.className("inputtext")).size();
		System.out.println(inputsize);
	}

}
