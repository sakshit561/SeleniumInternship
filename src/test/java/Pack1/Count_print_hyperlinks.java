package Pack1;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Count_print_hyperlinks {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\nives\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		WebDriver cd = new ChromeDriver();
		cd.get("https://www.calculator.net/");
		List<WebElement> li = cd.findElements(By.tagName("a"));
		li.size();
		for(WebElement el : li) {
			System.out.println(el.getText());
		}
		cd.close();
	}
}