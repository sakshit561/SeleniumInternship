package Pack1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LinkCountPerform {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mdim3\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver d =  new ChromeDriver();
		d.manage().window().maximize();
		WebDriverWait w =  new WebDriverWait(d,Duration.ofSeconds(20));
		d.get("https://rahulshettyacademy.com/AutomationPractice/");
		//count size of all links
		System.out.println(d.findElements(By.tagName("a")).size());
		WebElement footerLink = d.findElement(By.id("gf-BIG"));
		System.out.println(footerLink.findElements(By.tagName("a")).size());
		
		//click all link from FirstSection in Footer
		
//		WebElement firstSection = d.findElement(By.xpath("//table/tbody/tr/td[1]/ul"));
//		System.out.println(firstSection.findElements(By.tagName("a")).size());
//		for(int i=0;i<firstSection.findElements(By.tagName("a")).size();i++) {
//			String clicknewTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
//			firstSection.findElements(By.tagName("a")).get(i).sendKeys(clicknewTab);
//		}
		//click all link from SecondSection in Footer
		
//		WebElement secondSection = d.findElement(By.xpath("//table/tbody/tr/td[2]/ul"));
//		System.out.println(secondSection.findElements(By.tagName("a")).size());
//		for(int i=0;i<secondSection.findElements(By.tagName("a")).size();i++) {
//			String clicknewTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
//			secondSection.findElements(By.tagName("a")).get(i).sendKeys(clicknewTab);
//		}
		
		//click all link from ThirdSection in Footer
		
//		WebElement thirdSection = d.findElement(By.xpath("//table/tbody/tr/td[3]/ul"));
//		System.out.println(thirdSection.findElements(By.tagName("a")).size());
//		for(int i=0;i<thirdSection.findElements(By.tagName("a")).size();i++) {
//			String clicknewTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
//			thirdSection.findElements(By.tagName("a")).get(i).sendKeys(clicknewTab);
//		}
		 
		//click all link from fourthSection in Footer
		
				WebElement fourthSection = d.findElement(By.xpath("//table/tbody/tr/td[4]/ul"));
				System.out.println(fourthSection.findElements(By.tagName("a")).size());
				for(int i=0;i<fourthSection.findElements(By.tagName("a")).size();i++) {
					String clicknewTab=Keys.chord(Keys.CONTROL,Keys.ENTER);
					fourthSection.findElements(By.tagName("a")).get(i).sendKeys(clicknewTab);
				}
		
		
		}

}
