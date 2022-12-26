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

public class Action_Class {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		WebDriverWait w= new WebDriverWait(d,Duration.ofSeconds(10));
		
		d.get("https://www.amazon.in/");
		WebElement move=d.findElement(By.cssSelector("#nav-link-accountList"));
		Actions a=new Actions(d);
		a.moveToElement(move).perform();
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("#twotabsearchtextbox")));
		//a.moveToElement(d.findElement(By.cssSelector("#twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("fan").build().perform();
		a.moveToElement(d.findElement(By.cssSelector("#twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("fan").keyDown(Keys.ENTER).build().perform();
		a.moveToElement(move).contextClick().perform();
	}

}
