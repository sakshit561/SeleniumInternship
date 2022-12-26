package Pack1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MouseHover {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver d = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(d,Duration.ofSeconds(15));
		d.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		
		WebElement move = d.findElement(By.id("mousehover"));
		Actions ac = new Actions(d);
		ac.moveToElement(move).perform();
       
		//explicit wit use when only on one specific line
        //implicit on whole program execution
        // syntax of implicit wait
       // driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
	
		
		
		
   }

}
