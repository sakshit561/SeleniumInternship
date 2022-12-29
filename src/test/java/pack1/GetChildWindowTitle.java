package pack1;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
public class GetChildWindowTitle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				System.out.println("Hello Shubham");
				WebDriverManager.chromedriver().setup();
				WebDriver d =  new ChromeDriver();
				d.manage().window().maximize();
		         d.get("https://rahulshettyacademy.com/AutomationPractice/");
		         d.findElements(By.tagName("a")).size();
		         System.out.println( d.findElements(By.tagName("a")).size());
		     WebElement footerLink     = d.findElement(By.id("gf-BIG"));
		     System.out.println(footerLink.findElements(By.tagName("a")).size());
		     WebElement firstSection=d.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		     System.out.println(firstSection.findElements(By.tagName("a")).size());
			  for (int i=0;i<firstSection.findElements(By.tagName("a")).size();i++) {
				   String clicknewTab= Keys.chord(Keys.CONTROL,Keys.ENTER);
				   firstSection.findElements(By.tagName("a")).get(i).sendKeys(clicknewTab);

		      }
			  Set<String> title=d.getWindowHandles();
			  Iterator<String>it = title.iterator();
			  while(it.hasNext()) {
				  d.switchTo().window(it.next());
				  System.out.println(d.getTitle());
				  
				  
			  }
			}

		

	}