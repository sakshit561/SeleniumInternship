package Pack1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumPractice {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Administrator\\\\Downloads\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		WebDriverWait w= new WebDriverWait(driver, null );
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[3]/button[1]")).click();
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		Thread.sleep(2000);
	
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@class='promoCode']")).sendKeys("abc");
		driver.findElement(By.cssSelector("button[class='promoBtn']")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/button")).click();
		Thread.sleep(2000);
		
		WebElement el = driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/div/select"));
		Select s = new Select(el);
		s.selectByVisibleText("India");
		driver.findElement(By.xpath("//input[@type='checkbox']")).click();
		driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div/div/button")).click();
		
        }

}