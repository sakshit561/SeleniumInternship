package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkCountPerform {
	public static void main(String args[]) throws InterruptedException {
		
		WebDriver driver =new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		
		//---------count size of all links------
		System.out.println(driver.findElements(By.tagName("a")).size());
		//driver.findElement(By.tagName("a")).click();
		
		//---------count footer link--------------
		WebElement footerLink = driver.findElement(By.id("gf-BIG"));		
		System.out.println(footerLink.findElements(By.tagName("a")).size());
	    //----------count column link
		WebElement secondsection = driver.findElement(By.tagName("ul"));
		int temp = secondsection.findElements(By.tagName("a")).size();
		System.out.println(temp);
		//System.out.println(secondsection.findElements(By.tagName("a")).size());
		
		
		
		
		for(int i=0; i<temp; i++) {
			String clicknewTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
			
			secondsection.findElements(By.tagName("a")).get(i).sendKeys(clicknewTab);
		}
		

		
	}

}
