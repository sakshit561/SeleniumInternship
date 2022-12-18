package Pack1;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Mouse_actions {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\nives\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		WebDriver cd = new ChromeDriver();
		cd.get("https://demoqa.com/buttons");
		
//		click double click and context click actions :
		WebElement el = cd.findElement(By.xpath("//*[@id=\"doubleClickBtn\"]"));
		Actions ac = new Actions(cd);
		ac.doubleClick(el).perform();
		WebElement el2 = cd.findElement(By.xpath("//*[@id=\"rightClickBtn\"]"));
		ac.contextClick(el2).perform();
	}
}
