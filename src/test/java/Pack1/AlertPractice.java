package Pack1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AlertPractice {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		WebDriver driver =new ChromeDriver();
		WebDriverManager.chromedriver().setup();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().window().maximize();
		WebDriverWait w=new WebDriverWait(driver,Duration.ofSeconds(30));
		
		
		//alert box accept
		driver.findElement(By.xpath("//input[@id='alertbtn']")).click();
		//waiting
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("//input[@id='alertbtn']")));
		driver.switchTo().alert().accept();
		
       //alert box dismiss
		driver.findElement(By.xpath("//input[@id='confirmbtn']")).click();
		//waiting
		w.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("//input[@id='alertbtn']")));
		driver.switchTo().alert().dismiss();
	}

}
