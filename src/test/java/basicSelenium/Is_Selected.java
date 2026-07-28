package basicSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Is_Selected {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com");
		driver.manage().window().maximize();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		driver.findElement(By.linkText("Checkboxes")).click();
		
		boolean check1 = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]")).isSelected();
		boolean check2 = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[2]")).isSelected();
		if(check1==false) {
			driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[1]")).click();
		}
		
		if(check2==true) {
			driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/input[2]")).click();
		}
		
	}

}
