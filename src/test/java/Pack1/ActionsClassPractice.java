package Pack1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionsClassPractice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\verma\\Downloads\\chromedriver1\\chromedriver.exe");
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
//		a.moveToElement(move).contextClick().perform();
		
	    Set<String> s = d.getWindowHandles();
	    List<String> l = new ArrayList<String>();
	    l.addAll(s);
	    
	    
	    d.switchTo().window(l.get(1));
	    d.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/div/div/div/div[1]/div/div[2]/div/span/a/div/img")).click();
		
		
	   
		
	    

	}

}
