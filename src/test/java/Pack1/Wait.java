package Pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		WebDriverWait w= new WebDriverWait(driver, null );
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/button[1]")).click();
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("abc");
		driver.findElement(By.cssSelector("button[class='promoBtn']")).click();
        
	}

}