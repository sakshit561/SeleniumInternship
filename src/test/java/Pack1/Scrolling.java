package Pack1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Scrolling {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\mdim3\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver d =  new ChromeDriver();
		d.manage().window().maximize();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		d.get("https://www.rahulshettyacademy.com/AutomationPractice/");
		JavascriptExecutor js=(JavascriptExecutor) d;
		js.executeScript("window.scrollBy(0,700)");
		//js.executeScript("window.scrollTop=5000)");
		js.executeScript("document.querySelector('.tableFixHead').scrollTop=5000");
		
		//calculating all values sum of a div;
		
				List <WebElement> li=d.findElements(By.cssSelector(".tableFixHead td:nth-child(4)"));
				
				int temp=0;
				for (int i=0; i<li.size(); i++) {
					temp=temp+Integer.parseInt(li.get(i).getText());
				}
				System.out.println("Sum of all values in a div is equals to: "+temp);
				d.findElement(By.className("totalAmount")).getText();
			//int total=d.findElements(By.className("totalAmount")).getText();
	}
 
}
 