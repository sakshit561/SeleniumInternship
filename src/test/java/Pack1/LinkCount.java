package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;
		
		public class LinkCount {
		
			public static void main(String[] args) {
				
					System.out.println("Abhinav Agrawal");
				
					WebDriver driver =  new ChromeDriver();
					WebDriverManager.chromedriver().setup();
					driver.get("https://rahulshettyacademy.com/AutomationPractice/");
					//count all  links of website
					System.out.println(driver.findElements(By.tagName("a")).size());
					
					//count footer links 
					WebElement footerlink = driver.findElement(By.id("gf-BIG"));
					System.out.println(footerlink.findElements(By.tagName("a")).size());
					
					//driver.findElement(By.xpath("(//table/tbody/tr/td/ul)[1]"));
					WebElement firstSection = driver.findElement(By.xpath("(//table/tbody/tr/td[1]/ul)"));
					
					//link in a particular section
					System.out.println(firstSection.findElements(By.tagName("a")).size());
					
					//open links in new tabs
					for(int i = 0; i<firstSection.findElements(By.tagName("a")).size();i++) {
						String clickNewTab = Keys.chord(Keys.CONTROL,Keys.ENTER);
						firstSection.findElements(By.tagName("a")).get(i).sendKeys(clickNewTab);
					}
					
			}
		
		}
