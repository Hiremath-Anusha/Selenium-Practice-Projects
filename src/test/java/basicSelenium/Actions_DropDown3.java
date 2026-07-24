//Select multiple options from DropDown list

package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Actions_DropDown3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		driver.get("https://kirantestingacademy.com/dropdown/");
		driver.manage().window().maximize();
		WebElement list = driver.findElement(By.id("car-select"));
	    Select sc = new Select(list);
		//to check whether a particular dropdown list eligible for multiple selection
		System.out.println(sc.isMultiple());
		WebElement multiple = driver.findElement(By.id("city-select"));
		Select mult = new Select(multiple);
		
		if(mult.isMultiple()==true) {
			mult.selectByIndex(0);
			mult.selectByIndex(3);
			mult.selectByIndex(4);
		}
		//to deselect 
		//mult.deselectAll();
	}

}
