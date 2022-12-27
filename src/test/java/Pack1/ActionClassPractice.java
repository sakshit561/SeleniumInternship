package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

		public class ActionClassPractice {
		
				public static void main(String[] args) {
						System.out.println("Abhinav Agrawal");
						
						
						
						WebDriver driver =  new ChromeDriver();
						WebDriverManager.chromedriver().setup();
						
						driver.get("https://www.amazon.in/");
						driver.manage().window().maximize();
						
						//
						 WebElement move = driver.findElement(By.cssSelector("#nav-link-accountList"));
						
						 //Action class object making
						 Actions a = new Actions(driver);
						 
						 //pointer will go on selected location
						 a.moveToElement(move).perform();
						 
						 //this will type fan in uppercase in search bar 
						 a.moveToElement(driver.findElement(By.cssSelector("#twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("fan").build().perform();   
						
						 // WebElement search = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
						 //search.click();
						 
						 //a.moveToElement(driver.findElement(By.cssSelector("#twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("fan").doubleClick().build().perform();
						 
						 //a.moveToElement(driver.findElement(By.cssSelector("#twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("fan").keyDown(Keys.ENTER).build().perform();
						 //right click
						 a.moveToElement(move).contextClick().build().perform();
				
				
				}
		
		}
