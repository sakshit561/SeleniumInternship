package Pack1;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowTitle {

	public static void main(String args[]) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Nivedita\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		System.out.println(driver.findElements(By.tagName("a")).size());
        WebElement footerlink = driver.findElement(By.id("gf-BIG"));
        System.out.println(footerlink.findElements(By.tagName("a")).size());
        WebElement firstsection =driver.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
        System.out.println(firstsection.findElements(By.tagName("a")).size());
        for(int i=0;i<firstsection.findElements(By.tagName("a")).size();i++) {
        	String clicknewtab = Keys.chord(Keys.CONTROL,Keys.ENTER);
        	firstsection.findElements(By.tagName("a")).get(i).sendKeys(clicknewtab);
        }
        Set<String> title =driver.getWindowHandles();
       Iterator<String> it = title.iterator();
       while(it.hasNext()) {
    	   driver.switchTo().window(it.next());
    	   System.out.println(driver.getTitle());
       }
        
        
        
	}
}
