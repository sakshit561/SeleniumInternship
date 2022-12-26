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

public class AmazonActionClassPractice {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mdim3\\OneDrive\\Desktop\\chromedriver_win32\\chromedriver.exe");
		WebDriver d =  new ChromeDriver();
		d.manage().window().maximize();
		WebDriverWait w =  new WebDriverWait(d,Duration.ofSeconds(20));
		
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
