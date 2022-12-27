package Pack1;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandlePractice {

			public static void main(String[] args) {
				System.out.println("Abhinav Agrawal");
				
				WebDriver driver =  new ChromeDriver();
				WebDriverManager.chromedriver().setup();
				WebDriverWait w = new WebDriverWait(driver,Duration.ofSeconds(20));
				driver.get("https://rahulshettyacademy.com/loginpagePractise/");
				driver.manage().window().maximize();
				driver.findElement(By.cssSelector(".blinkingText")).click();
				Set<String> window = driver.getWindowHandles();
				Iterator <String> it = window.iterator();
				String parentId = it.next();
				String childId = it.next();
				driver.switchTo().window(childId);
				w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".im-para.red")));
				System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText());
				String emailId = driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].trim().split(" ")[0];
				System.out.println(emailId);
				driver.switchTo().window(parentId);
				driver.findElement(By.id("username")).sendKeys(emailId);
				
				
				
			}
		
		}
