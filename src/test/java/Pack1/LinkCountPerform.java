package Pack1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkCountPerform {
	public static void main(String[] args) {
		System.out.println("Hello Nivesh");
		System.setProperty("webdriver.chrome.driver","C\\Users\\nives\\eclipse-workspace\\chromedriver_win32\\chromedriver.exe");
		WebDriver cd = new ChromeDriver();
		cd.manage().window().maximize();
//		lauching web page to perform test :
		cd.get("https://rahulshettyacademy.com/AutomationPractice/");
//		printing all links of given page :
		System.out.println(cd.findElements(By.tagName("a")).size());
		
//		printing all links of footersection :  
		WebElement footer = cd.findElement(By.xpath("//div[@id=\"gf-BIG\"]"));
		System.out.println(footer.findElements(By.tagName("a")).size());
		

//		making chord of control and enter keys (for open links in new tabs);
		String keys = Keys.chord(Keys.CONTROL,Keys.ENTER);
		
//		opening all links of leftsection in different tabs :
		WebElement leftSection = cd.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
		List<WebElement> s = leftSection.findElements(By.tagName("a"));
		for(WebElement el : s)	el.sendKeys(keys);
		
//		opening all links of second left section :
//		WebElement secondLeft = cd.findElement(By.xpath("//table/tbody/tr/td[2]/ul"));
//		List<WebElement> s2 = secondLeft.findElements(By.tagName("a"));
//		for(WebElement el : s2)	el.sendKeys(keys);
		
//		opening all links of second last section :
//		WebElement secondLast = cd.findElement(By.xpath("//table/tbody/tr/td[3]/ul"));
//		List<WebElement> s3 = secondLast.findElements(By.tagName("a"));
//		for(WebElement el : s3)	el.sendKeys(keys);
		
//		opening all links of last section :
//		WebElement last = cd.findElement(By.xpath("//table/tbody/tr/td[4]/ul"));
//		List<WebElement> s4 = last.findElements(By.tagName("a"));
//		for(WebElement el : s4)	el.sendKeys(keys);
		
	}
}
