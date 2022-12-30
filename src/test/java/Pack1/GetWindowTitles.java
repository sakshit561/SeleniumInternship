package Pack1;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GetWindowTitles {
	public static void main(String[] args) throws InterruptedException {
		System.out.println("Hello Nivesh");
		WebDriverManager.chromedriver().setup();
		WebDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
		cd.get("https://rahulshettyacademy.com/AutomationPractice/");
		
//		making chord of control and enter keys (for open links in new tabs);
		String keys = Keys.chord(Keys.CONTROL,Keys.ENTER);
		
		WebElement leftSection = cd.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		List<WebElement> s = leftSection.findElements(By.tagName("a"));
		for(WebElement el : s) {
			el.sendKeys(keys);
		}
		
		Set<String> title = cd.getWindowHandles();
		Iterator<String> it = title.iterator();
		while(it.hasNext()) {
			cd.switchTo().window(it.next());
			System.out.println(cd.getTitle());
			Thread.sleep(3000);
		}
		
			
	}
}

