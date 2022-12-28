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
		System.out.println("Hello Nivesh");
		WebDriverManager.chromedriver().setup();
		WebDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
		cd.get("https://www.rahulshettyacademy.com/AutomationPractice/");
//		WebElement c = cd.findElement(By.xpath("/html/body/div[3]/div[2]/fieldset[2]/div[1]"));
		JavascriptExecutor js = ((JavascriptExecutor)cd);
		js.executeScript("window.scrollBy(0,700)");
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
//		calculating all values sum of a div  :
		int temp = 0 ;
		List<WebElement> li = cd.findElements(By.xpath("//div[@class='tableFixHead']/table/tbody/tr/td[4]"));
		for(int i = 1 ; i <= li.size() ; i++) {
			String value = cd.findElement(By.xpath("//div[@class='tableFixHead']/table/tbody/tr["+i+"]/td[4]")).getText();
			int toInt = Integer.parseInt(value);
			temp += toInt;
		}
		System.out.println("Sum of all value in div = "+temp);
		
		
	}
}
