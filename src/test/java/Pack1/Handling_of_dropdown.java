package Pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Handling_of_dropdown {
	public static void main(String[] args) {
		System.out.println("hello nivesh");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nives\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		WebDriver cd = new ChromeDriver();
		cd.get("https://www.opencart.com/index.php?route=account/register");
		WebElement e = cd.findElement(By.id("input-country"));

		Select dd = new Select(e);
//		dd.selectByVisibleText("Albania");
//		dd.selectByValue("3");
//		dd.selectByIndex(5);

//		dd.deselectAll();

//		to get all options of select tag :
		List<WebElement> el = dd.getOptions();
		System.out.println(el.size());
		for (WebElement el2 : el) {
			System.out.println(el2.getText());
		}
		cd.close();

	}
}
