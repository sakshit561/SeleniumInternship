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

public class ActionsClassPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver d = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(d,Duration.ofSeconds(15));
		d.get("https://www.amazon.in/");
		WebElement move=d.findElement(By.cssSelector("#nav-link-accountList"));
		Actions a=new Actions(d);
		a.moveToElement(move).perform();
		Thread.sleep(3000);
		a.moveToElement(d.findElement(By.id("twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("bags").keyDown(Keys.ENTER).build().perform();
	//next is used to select options from bags variety
	//wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@aria-label='bags for women']"))).click();
//		a.moveToElement(move).contextClick().build().perform();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div/div[1]/div/div[2]/div/span/a/div/img]"))).click();
		
		
		
	}

 }
