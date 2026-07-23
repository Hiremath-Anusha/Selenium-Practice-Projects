package basicSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actions_Dropdown2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://kirantestingacademy.com/dropdown/");
		driver.manage().window().maximize();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(By.id("car-select")));
		
		Select sc = new Select(dropdown);
		int listsize = sc.getOptions().size();
		for (int i =0; i<listsize; i++) {
		String listnames = sc.getOptions().get(i).getText();
		System.out.println(listnames);
		
		}
		driver.quit();
	}

}
