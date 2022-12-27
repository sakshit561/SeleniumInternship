package Pack1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frame {
	
	
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			System.out.println("Abhinav Agrawal");
			
			WebDriver driver =  new ChromeDriver();
			WebDriverManager.chromedriver().setup();
			
			driver.get("https://jqueryui.com/droppable/");
			driver.manage().window().maximize();
			
			System.out.println(driver.findElements( By.className("demo-frame")).size());
			//driver.switchTo().frame(0);
			driver.switchTo().frame(driver.findElement( By.className("demo-frame")));
			//driver.findElement( By.id("draggable")).click();
			Actions a = new Actions(driver);
			WebElement source = driver.findElement( By.id("draggable"));
			WebElement target = driver.findElement( By.id("droppable"));
			a.dragAndDrop(source, target).perform();
			
			driver.switchTo().defaultContent();
			
			
		}
	
	}
